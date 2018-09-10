
package weekendhw1;

import java.util.Scanner;


public class MobilePhone {
	 
	
	 // 2 homework for check ifelse  
	 public void ifelse()
	 {
	 int p1=45000;
	  int p2=6000;

	 
		 if(p1>p2)
		 {
		 	System.out.println("the costliest mobile is"+p1);
		 	System.out.println("the cheapest mobile is"+p2);


		 	}
		 else
		 {
		 	System.out.println("the costliest mobile is"+p2);
		 	System.out.println("the cheapest mobile is"+p1);
		 }
	 
	 }
	 
	 // 3 homework for ifelseif
/*	 public void ifelseif()
	 {
		 Scanner scan = new Scanner(System.in);
		 int input=scan.nextInt();
		 if(input == 944)
		 {
			 System.out.println("BSNL ");
		 }
		 else if(input == 900)

		 {
			 System.out.println("Airtel");
		 }
		 else if(input == 897)

		 {
			 System.out.println("Idea");
		 }
		 else if(input == 630 )
		 {
			 System.out.println("JIO");
		 }
		 else
		 {
			 System.out.println("not found");
		 }
	 }
	 */
	 public void switchcase()
	 {
		 System.out.println("Enter input");
	 Scanner get = new Scanner(System.in);
	 int input=get.nextInt();
	
	 switch(input)
	 {
	 case 944: System.out.println("BSNL");
	 break;
	 case 900:System.out.println( "AIRTEL");
	 break;
	 case 897:System.out.println("IDEA");
	 break;
	 case 630:System.out.println("JIO");
	 break;
	 }
	 }
		 
	 //hw4
	// long mobileNumber;
	 //String SMS;
	public int sendSms(long mobileNumber,String SMS)
	 {
		 int INR=9;
	 
		 while(INR>0) {
			 System.out.println("Make a call"+ "   "+ mobileNumber);
			 INR=INR-2;
			 System.out.println("Good Morning!Happy Sunday!"+SMS +"   " +mobileNumber);
			 INR=INR-1;
		 }
		 return INR;
	 
	 }
	//hw1
	public void sendSms1(long mobileNumber,String SMS)
	{
	String SMS1="Good Morning!Happy Sunday!";
	System.out.println(mobileNumber+"          "+"sending a msg"+"          "+SMS1);
	}
	 
	 
	 
	 
	 
	public static void main(String[] ags) {
		
		MobilePhone a = new MobilePhone();
		a.ifelse();
	//	a.ifelseif();
        a.switchcase();
}


	}

