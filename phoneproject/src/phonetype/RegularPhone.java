package phonetype;
import java.util.Scanner; 

interface A{
	void call();
	void message();

}


public class RegularPhone implements A{
	Scanner sc=new Scanner(System.in);

		public void call(){
		System.out.println("1.CALLING........");
		}
		public void message(){
		System.out.println("2.MESSAGE");
		}
		public void radio(){
		System.out.println("3.RADIO");
		}
		public void setting()
		{
			
			System.out.println("ENTER UR CHOICE 1 to 3:");
			int ab=2;
			ab=sc.nextInt();
			switch(ab){
				case 1:
				System.out.println("CALLING to 7598217526");
				break;
				case 2:
				System.out.println("MESSAGE SENT");
			 	break;
				case 3:
				System.out.println(" RADIO PLAYING....");
				break;
				
				default:
				System.out.println("ENTER VALID NUMBER");
			}
		}
	}


