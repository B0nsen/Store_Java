package Store;

public class ProductNotFoundException extends Exception {
	String text;
	public ProductNotFoundException(String text1)
	{
		text = text1;
	}
	public String GetText()
	{
		return text;
	}
	public void SetText(String text1)
	{
		text = text1;
	}
}
