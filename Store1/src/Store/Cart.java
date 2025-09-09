package Store;
import java.util.ArrayList;

public class Cart {
	private ArrayList<Product> Products;
	
	public Cart()
	{
		Products = new ArrayList<Product>();
	}
	
	public Cart(ArrayList<Product> p)
	{
		Products = p;
	}
	
	public void AddProduct(Product product)
	{
		Products.add(product);
	}
	public void RemoveProduct(Product product) throws ProductNotFoundException
	{
		if(Products.contains(product))
		{
			Products.remove(product);
		}
		else
		{
			throw new ProductNotFoundException("Doesnt exist");
		}
		System.out.println("Product removed successfully");
	}
	
	public int GetPCount()
	{
		return Products.size();
	}
}
