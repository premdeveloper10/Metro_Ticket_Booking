package Applications;

import java.util.Calendar;
import java.io.*;
import java.util.Scanner;
public class Metro {
	static OutputStream fr;
    static Scanner s=new Scanner (System.in);
	public static void main(String[] args) throws Exception{ 
		fr=new FileOutputStream("E://Metro.txt");
		
System.out.println("*****\"WELCOME TO CMRL METRO MOBILE TICKET BOOKING\"*****\n");
		
		System.out.println("METRO STATION ROUTS....!\n");
		System.out.println("\"1.ARUMBAKKAM\"");
		System.out.println("\"2.VADAPALANI\"");
		System.out.println("\"3.ASHOKNAGAR\"");
		System.out.println("\"4.EKATTUTHANGAL\"");
		System.out.println("\"5.AIRPORT\"");
		System.out.println();
		
		Thread.sleep(300);
		System.out.println("SELECT YOUR FROM STATION:");
		String from=s.next();
		Thread.sleep(300);
		System.out.println();
		System.out.println("SELECT YOUR TO STATION:");
        String To=s.next();
		Thread.sleep(300);
		System.out.println();
		System.out.println("\tIF YOU CONFIRM YOUR SELECTED FROM AND TOPLACE..?");
		
		System.out.println("1.YES:and Continue to payment press\"1\"");
		System.out.println("2.No: and reselect your locations please press\"2\"");
		System.out.println("3.OR YOU WANT TO EXIT PRESS\"3\"");
		int Choice=s.nextInt();
		switch (Choice) {
		case 1: {
			      System.out.println("Before you payment please verify for your ticket confirmations");
			      otp();
		         payment();
		         String data=("\t^^^^TAKE YOUR ONLINE QR TICKET1^^^^\n"
			 		+"\t\t1.FROM:"+from+"\n"
			 		+"\t\t2.TO:"+To+"\n"
			 		+"\t\t3.DATE:"+Date()+"\n"
			 		+"\t\t4.TIME:"+time()+"\n"
			 	  +">>>><THIS TICKET IS VALID FOR NEXT 2:30 hrs...only><<<<\n"
			 		+""
			 	  + "  ***********\\\"THANK YOU FOR CHOOSING CMRL\\\"**************\n"
			 	  + "            ********\\\"HAPPY JOURNEY\\\"********"); 
		         byte b[]=data.getBytes();
		        fr.write(b);
		        fr.close();
		         
		         System.out.println("\t^^^^TAKE YOUR ONLINE QR TICKET1^^^^");
		 		System.out.println("\t\t1.FROM:"+from);
		 		System.out.println("\t\t2.TO:"+To);
		 		System.out.println("\t\t3.DATE:"+Date());
		 		System.out.println("\t\t4.TIME:"+time());
		 		System.out.println("  >>>><THIS TICKET IS VALID FOR NEXT 2:30 hrs...only><<<<");
		 		System.out.println();
		 		Thread.sleep(2000);
		 		System.out.println("  ***********\"THANK YOU FOR CHOOSING CMRL\"**************");
		 		System.out.println();
		 		System.out.println("         ********\"HAPPY JOURNEY\"********");
		 		
		break;}
		case 2: {
		    
			Metro.main(args); 
		break;}
		
		default:
			System.out.println("\t\t*******Thank you!********");
		}
		System.out.println("If you use again booking press\"1\"");
		System.out.println("If you Don't use again booking press\"2\"");
		int ss=s.nextInt();
		switch (ss) {
		case 1:{
			 Metro.main(args);
			
			break;}
                  
		default:{
			System.out.println("\t\tThank You!!!");
		}
		}
	    
		
		
	}
	public static void payment()throws Exception {
    
	System.out.println("Please Select The Payment Method\n1.Phone Pay\n2.Google Pay\n3.Paytm\n4.Cash\n");
	System.out.println("ENTER YOUR OPTIONS....\"1\" OR \"2\" 0R \"3\" OR \"4\"");
	int payment=s.nextInt();
	switch(payment)
	{
	case 1:    {    System.out.println("\"WELCOME TO PHONE PAY\"");
		            System.out.println(".....please enter your MPIN.....");
				    int mpin=s.nextInt();
                    System.out.println("your mpin is correct\n");
                    System.out.println("Your common amount is:RS-20");
		            System.out.println("Note:the amount is dierectly selected from UPI");
			        System.out.println("PLEASE ENTER YOUR UPI PIN:\"_ _ _ _ _ _ _\"\n");
				    int upi=s.nextInt();
			        System.out.println("Processing Please Wait.....\n");
					Thread.sleep(1000);
					System.out.println("\t<.........YOUR PAYMENT SUCESSFULL.......>\n");
	break;}
	case 2: 
		{        System.out.println("\"WELCOME TO GOOGLE PAY\"");  
		         System.out.println(".....please enter your MPIN.....");
				 int mpin2=s.nextInt();
                 System.out.println("your mpin is correct\n");
                 System.out.println("Your common amount is:RS-20");
		         System.out.println("Note:the amount is dierectly selected from UPI");
			     System.out.println("PLEASE ENTER YOUR UPI PIN:\"_ _ _ _ _ _ _\"\n");
                  int upi=s.nextInt();
			     System.out.println("Processing Please Wait.....\n");
					Thread.sleep(1000);
		break;}
	case 3:
		{        System.out.println("\"WELCOME TO PAYTM\""); 
		         System.out.println(".....please enter your MPIN.....");
				 int mpin3=s.nextInt();
                 System.out.println("your mpin is correct\n");
		         System.out.println("Your common amount is:RS-20");
		         System.out.println("Note:the amount is dierectly selected from UPI");
			     
				 System.out.println("PLEASE ENTER YOUR UPI PIN:\"_ _ _ _ _ _ _\"\n");
				 int upi=s.nextInt();
			     System.out.println("Processing Please Wait.....");
				 Thread.sleep(1000);
				 System.out.println("\t<.........YOUR PAYMENT SUCESSFULL.......>\n");
		break;}

	case 4:
		{  System.out.println("GIVE YOUR CASH ON DELIVERY");
		   System.out.println("NOTE:THE BELOW QR TICKET IS JUST FOR VERIFICATIONS AFTER THE PAYMENT THE ORINGIAL TICKET IS PROVIDING IN CMRL TICKET COUNTER");
	     
					System.out.println("\t<<<<<<<<<<<<<<<\"THANK YOU!!! VISIT AGAIN!!!\">>>>>>>>>>>>>>>>");
					break;}
	}
	
	}
	public static void otp()throws Exception {
	   System.out.println("OTP WILL BE SEND YOUR REGISTER MOBILE NUMBER XXXXXXXX74");
		System.out.println("Please EnterThe OTP :");
		Thread.sleep(1000);
		double otp=9999*Math.random()+9999;
		int check=(int)otp;
		System.out.println(check);
		int otp_is=s.nextInt();
		if(check==otp_is)
         {
			System.out.println("**********YOUR OTP VERIFICATION SUCCESSFULL********");
         }
        else 
		      {
			   System.out.println("PLEASE ENTER THE CORRECT OTP");
        System.out.println("OTP WILL BE SEND AGAIN YOUR REGISTER MOBILE NUMBER XXXXXXXX74");
		System.out.println("Please Enter the correct OTP :");
		Thread.sleep(1000);
		double otp1=9999*Math.random()+9999;
		int check1=(int)otp;
		System.out.println(check1);
		int otp_is1=s.nextInt();
		System.out.println("**********YOUR OTP VERIFICATION SUCCESSFULL********\n");
		      }
		
	}
	public static String Date() {
		
		return " "+java.time.LocalDate.now();
	}
	public static String time() {
		
		return String.format("%tr",Calendar.getInstance());
		
	}
         
	
}		
