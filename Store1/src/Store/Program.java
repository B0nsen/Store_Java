package Store;
import java.util.ArrayList;

import java.util.Arrays;

public class Program {
	
	public static void main(String[] args) {
		DigitalProduct DP1 = new DigitalProduct("DigitalProduct1", "Brand1", 100, "Code1");
		DigitalProduct DP2 = new DigitalProduct("DigitalProduct2", "Brand2", 120, "Code2");
		DigitalProduct DP3 = new DigitalProduct("DigitalProduct3", "Brand3", 110, "Code3");
		DigitalProduct DP4 = new DigitalProduct("DigitalProduct4", "Brand4", 130, "Code4");
		PhysicalProduct PP1 = new PhysicalProduct("PhysicalProduct1", "Brand1", 100, 10);
		PhysicalProduct PP2 = new PhysicalProduct("PhysicalProduct2", "Brand2", 110, 7);
		PhysicalProduct PP3 = new PhysicalProduct("PhysicalProduct3", "Brand3", 130, 6);
		PhysicalProduct PP4 = new PhysicalProduct("PhysicalProduct4", "Brand4", 120, 9);
		
		Cart C1 = new Cart();
		C1.AddProduct(DP1);
		C1.AddProduct(PP1);
		C1.AddProduct(PP4);
		Cart C2 = new Cart();
		C1.AddProduct(DP3);
		C1.AddProduct(DP4);
		C1.AddProduct(PP3);
		Cart C3 = new Cart();
		C1.AddProduct(DP2);
		C1.AddProduct(PP2);
		C1.AddProduct(PP4);
		
		User U1 = new User("Name1", "UID1", new ArrayList<>(Arrays.asList(C1,C2)));
		User U2 = new User("Name2", "UID2", new ArrayList<>(Arrays.asList(C2,C3)));
		User U3 = new User("Name3", "UID3", new ArrayList<>(Arrays.asList(C1,C3)));
		
		OnlineStore Store = new OnlineStore(new ArrayList<>(Arrays.asList(U1,U2,U3)));
		
		//System.out.println(Store.GetAllProducts());
		
		//Purchasable[] P = {DP1,DP2,DP3,DP4,PP1,PP2,PP3,PP4};
		//Store.PurchaseAll(P);
		
		U1.RemoveProduct(0, DP1); // Первое удаление продукта проходит успено
		U1.RemoveProduct(0, DP1); // Второе удаление выкидывает ProductNotFoundException
	}
}
