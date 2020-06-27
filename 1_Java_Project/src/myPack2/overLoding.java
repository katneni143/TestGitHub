package myPack2;

public class overLoding {

	void displayValue()
	{
		System.out.println("Hello World");
	}
	
	void displayValue(String Val1)
	{
		System.out.println("String Value Is = " + Val1);
	}
	
	void displayValue(int Val1)
	{
		System.out.println("Int Value Is = " + Val1);
	}
	
	void displayValue(int Val1, int Val2)
	{
		System.out.println("Int Values Are = " + Val1 + " And " + Val2);
	}
	void addValues(int Val1, int Val2)
	{
		System.out.println("Val 1 + Val 2 = " + (Val1 + Val2));
	}
	
	void addValues(String Val1, String Val2)
	{
		System.out.println("Val 1 + Val 2 = " +  Val1 + " " + Val2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overLoding OL = new overLoding();
		OL.displayValue();
		OL.displayValue(10);
		OL.displayValue("Sridhar");
		OL.displayValue(10, 20);
		
		OL.addValues(10, 5);
		OL.addValues("Sridhar", "Katneni");
	}
}
