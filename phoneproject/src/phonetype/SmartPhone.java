package phonetype;
import java.util.Scanner; 

	public class SmartPhone extends RegularPhone{
		Scanner sc=new Scanner(System.in);
		public void music(){
		System.out.println("Music Playing..");
		}
		public void vedio(){
		System.out.println("VEDIO Playing..");
		}
		public void internet(){
		System.out.println("INTERNET WORKING..");
		}
		public void store()
		{
			
			System.out.println("ENTER UR CHOICE 1 to 3:");
			int ab=3;
			ab=sc.nextInt();
			switch(ab){
				case 1:
				System.out.println("CALLING to 7598217526");
				break;
				case 2:
				System.out.println("MESSAGE SENT &MUSIC STOP");
			 	break; 
				case 3:
				System.out.println(" MUSIC PLAYING....");
				break;
				case 4:
				System.out.println("MOVIE PLAYING");
				break;
				case 5:
				System.out.println("INTERNET IS ON");
				break;
				default:
				System.out.println("ENTER VALID NUMBER");
			}
		}
	}




