
public class Test {
	
	void display()throws NullPointerException , ArithmeticException
	{
		int x = 10;
		int y = x/0;
		System.out.println(y);
	}
	public static void main(String[] args) {
	Test t =new Test();
		try {
			t.display();
		
		}
	catch(NullPointerException| ArithmeticException e)
		{
			System.out.println(e);
		}
	System.out.println("COOL");
	

}
}
