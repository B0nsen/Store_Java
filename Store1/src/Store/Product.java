package Store;

public class Product implements Purchasable {
	private String name;
	private String brand;
	private int price;
	
	public Product() {
		name = "";
		brand = "";
		price = 0;
	}
	
	public Product(String name1, String brand1, int price1)
	{
		name = name1;
		brand = brand1;
		price = price1;
	}
	
	public void SetName(String name1)
	{
		name = name1;
	}
	public String GetName()
	{
		return name;
	}
	public void SetBrand(String brand1)
	{
		brand = brand1;
	}
	public String GetBrand()
	{
		return brand;
	}
	public void SetPrice(int price1)
	{
		price = price1;
	}
	public int GetPrice()
	{
		return price;
	}
	
	@Override
	public void Purchase() {
		System.out.println("Продукт " + name + " был куплен за " + price + " грн");
	}
	
	@Override
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("Product deleted");
	}
}
