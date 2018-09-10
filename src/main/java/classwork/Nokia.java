/**
 * 
 */
package classwork;



/**
 * @author MOHAN
 *
 */
public class Nokia {

		public static void main(String[] args) {
		
		Mobile aa= new Mobile();
		Nokia bb = new Nokia();
		//aa.lang();
		aa.lang1();
			bb.color();
bb.network(2222);
	}
public void color()
{
	int colour= 1;
	if(colour==1)
		
	{
		System.out.println("phone is iphone");
	
}else {
	System.out.println("phone is android");
	}
	
}
public void network( int sim)
{
	System.out.println("the sim card is"  + "  " + sim);
}
}

