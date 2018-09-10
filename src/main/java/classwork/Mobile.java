package classwork;

public class Mobile {
	int keypadtamil,keypadenglish;

	public static void main(String[] args) {
		Mobile aa= new Mobile();
		Nokia bb = new Nokia();
		String mm =aa.lang();
		bb.network(2222);
//System.out.println(aa.lang());
		aa.lang1();
			

	}
	 private String lang()
	 
	{
		 int button =1;
	System.out.println("keypadenglish");
		System.out.println(button);
		return "keypadtamil";
	}
	 void lang1()
	{
		System.out.println("keypadtamil");
	}
	}


