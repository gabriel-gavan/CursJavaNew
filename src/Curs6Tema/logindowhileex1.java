package Curs6Tema;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class logindowhileex1 {
	String validusername = "TestUser";
	int validpassword = 1234;
	int failedlogincount = 0;
	String username ;
	int pass;
	
	//Scanner scan = new Scanner (System.in);
	boolean valid = false;
	
	public String getUsername () {
		System.out.println("Introdu username:");
		Scanner scan = new Scanner (System.in);
		username = scan.nextLine();
//		try {
//			TimeUnit.SECONDS.sleep(5);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return username;
			}
	
	public int GetPassword () {
		System.out.println("Introdu o parola:");
		Scanner scan = new Scanner (System.in);
		int pass = scan.nextInt();
		return pass;
		}
	
	public void checkValidUsernameAndPassword(String username, int pass) {
		
		if (username.equals(validusername) && pass == validpassword ) {
			valid = true;
			System.out.println("Login Successfull");
		} else {
			System.out.println("Login Error");
			valid = false;
			
		}
	}
	public static void main(String[] args) {
		logindowhileex1 validator = new logindowhileex1 ();
		String username1 ;
		validator.failedlogincount = 0;
	  //validator.getUsername();
	 do { 
	 	username1 = validator.getUsername();
	 	int pass1 = validator.GetPassword();
		 validator.checkValidUsernameAndPassword(username1, pass1);
		 if (validator.valid == true) {
			 break;
		 }
		 else
		 {
			 validator.failedlogincount++;
		 }
	 } while  (validator.failedlogincount<3 && validator.valid == false) ;
	 
if (validator.failedlogincount >=3 && validator.valid == false)
{
	System.out.println("Maximum attempts reached. User blocked");
}

}
}


