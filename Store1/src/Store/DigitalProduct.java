package Store;

public class DigitalProduct extends Product {
	private String code;
	
	public DigitalProduct()
	{
		super();
	}
	public DigitalProduct(String Name, String Brand, int Price, String Code)
	{
		super(Name, Brand, Price);
		code = Code;
	}
}
