package Store;

public class PhysicalProduct extends Product {
private int weight;
	
	public PhysicalProduct()
	{
		super();
	}
	public PhysicalProduct(String Name, String Brand, int Price, int Weight)
	{
		super(Name, Brand, Price);
		weight = Weight;
	}
}
