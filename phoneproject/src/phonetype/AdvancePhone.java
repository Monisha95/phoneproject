package phonetype;
import java.util.Scanner; 

	
	public class AdvancePhone extends SmartPhone{
		Scanner sc=new Scanner(System.in);
		public void chatting()
		{
		System.out.println("CHATTING...");
		}
	public void screen()
		{
			
			System.out.println("ENTER UR CHOICE 1 to 3:");
			int ab=0;
			ab=sc.nextInt();
			switch(ab){
				case 1:
				System.out.println("CALLING to 7598217526");
				break;
				case 2:
				System.out.println("MESSAGE SENT &MUSIC STOP");
			 	break; 
				case 3:
				System.out.println(" HEARING SONGS  ");
				break;
				case 4:
				System.out.println(" WATCHING MOVIE ");
				break;
				case 5:
				System.out.println("INTERNET IS ON");
				break;
				case 6:
				System.out.println("CHATTING WITH MY FRIENDS&FAMILY");
				break;
				default:
				System.out.println("ENTER VALID NUMBER");
			}
		}

	}	

