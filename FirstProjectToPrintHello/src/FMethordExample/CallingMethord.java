package FMethordExample;

public class CallingMethord {

	public static void main(String[] args) {
		MethordExamp.callme("niraj");
		MethordExamp.callme("Rajina");
		MethordExamp.callme("Ranjan");

		// ---For Interger using void-----------

		// MethordExamp.Add(20,30);

	int aa = MethordExamp.add1(7, 7);
	int bb=aa*2;
	
	System.out.println("Adding of two values are:- " +aa);
	System.out.println("Multiply of two values are " +bb);
		

	}

}
