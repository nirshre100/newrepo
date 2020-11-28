package FMethordExample;

public class MethordExamp {
	public static void callme(String name)
//For String
	{
		System.out.println("Hello " + name.toUpperCase());
	}

//For Interger using void no return value
	public static void Add(int a, int b) {
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
	}

	// For Interger using Return value
	public static int add1(int a,int b)
	{
		return(a+b);
		
	}
}
