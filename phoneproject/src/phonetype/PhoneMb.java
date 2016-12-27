package phonetype;
import java.util.Scanner;
	
public class PhoneMb {
	Scanner sc=new Scanner(System.in);
		public void mobilePhone(){
		
		System.out.println("1.REGULAR PHONE");
		System.out.println("2.SMART PHONE");
		System.out.println("3.ADVANCE PHONE");
		System.out.println("ENTER YOUR CHOICE");
		
		int choice=0;
		choice=sc.nextInt();
		switch(choice){
			case 1:
			System.out.println("BRAND=NOKIA"+"COLOUR=BLACK"+" "+"PRICE=RS.3500"+" "+"SCREEN SIZE=4'inches");
			RegularPhone rp=new RegularPhone();
			rp.call();
			rp.message();
			rp.radio();
			rp.setting();
			break;
			case 2:
			System.out.println("BRAND=SAMSUNG"+" "+"COLOUR=WHITE"+" "+"PRICE=RS.6000"+" "+"SCREEN SIZE=5'inches");
			SmartPhone sp=new SmartPhone();
			sp.call();
			sp.vedio();
			sp.music();
			sp.internet();
			sp.store();
			break;
			case 3:
			System.out.println("BRAND=IPHONE"+"  "+"COLOUR=GOLD PINK"+" "+"PRICE=RS.21000"+" "+"SCREEN SIZE=7'inches");
			AdvancePhone ap=new AdvancePhone();
			ap.call();
			ap.message();
			ap.music();
			ap.vedio();
			ap.internet();
			ap.chatting();
			ap.screen();
			break;
			
			default:
			System.out.println("INVALID NUMBER...");
			System.out.println("ENTER 1 TO 3:");
		}
		
		
		
		}



	}


