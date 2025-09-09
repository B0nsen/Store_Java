package Store;
import java.util.ArrayList;

public class User {
	private String name;
	private String Id;
	private ArrayList<Cart> Carts;
	
	public User()
	{
		Carts = new ArrayList<Cart>();
		name = "";
		Id = "";
	}
	public User(String name1, String Id1, ArrayList<Cart> c)
	{
		name = name1;
		Id = Id1;
		Carts = c;
	}
	public String GetId()
	{
		return Id;
	}
	public void SetId(String id)
	{
		Id = id;
	}
	public String GetName()
	{
		return name;
	}
	public void SetName(String n)
	{
		name = n;
	}
	public int GetTotalProducts()
	{
		int res = 0;
		for(Cart c : Carts)
		{
			res+=c.GetPCount();
		}
		return res;
	}
	public void AddProduct(int CartIndex, Product product)
	{
		Cart c = Carts.get(CartIndex);
		c.AddProduct(product);
	}
	public void RemoveProduct(int CartIndex, Product product)
	{
		Cart c = Carts.get(CartIndex);
		try
		{
			c.RemoveProduct(product);
		} catch(ProductNotFoundException e)
		{
			e.printStackTrace(System.err);
		}
		
	}
	public void AddCard(Cart c)
	{
		Carts.add(c);
	}
}
