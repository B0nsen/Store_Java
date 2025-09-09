package Store;
import java.util.ArrayList;

public class OnlineStore {
	private ArrayList<User> Users;
	
	private static int ProductCount;
	
	static {
		ProductCount = 0;
	}
	
	public OnlineStore()
	{
		Users = new ArrayList<User>();
	}
	public OnlineStore(ArrayList<User> u)
	{
		Users = u;
		for(User user : Users)
		{
			ProductCount += user.GetTotalProducts();
		}
	}
	
	public void AddProductToCart(String userId, Product product, int CartIndex)
	{
		for(User u : Users)
		{
			if(u.GetId() == userId)
			{
				u.AddProduct(CartIndex, product);
				ProductCount++;
				break;
			}
		}
	}
	public void RemoveProductFromCart(String userId, Product product, int CartIndex)
	{
		for(User u : Users)
		{
			if(u.GetId() == userId)
			{
				u.RemoveProduct(CartIndex, product);
				ProductCount--;
				break;
			}
		}
	}
	public void AddUser(User u)
	{
		Users.add(u);
		ProductCount += u.GetTotalProducts();
	}
	public void RemoveUser(User u)
	{
		Users.remove(u);
		ProductCount -= u.GetTotalProducts();
	}
	public void PurchaseAll(Purchasable[] items)
	{
		for(Purchasable p : items)
		{
			p.Purchase();
		}
	}
	public int GetAllProducts()
	{
		return ProductCount;
	}
}
