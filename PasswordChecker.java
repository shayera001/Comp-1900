import java.util.*;
public class PasswordChecker  {
	public static void main(String[] args) {
		//main
		String answer = "sloth";
		int times=4; //initial times
		Scanner in=new Scanner(System.in);
	   
		
			while(times!=0){
				 System.out.println("Enter your password: ");//
	             String guess=in.nextLine();//input password
	             times=times-1;
	             if(!guess.equals(answer)&&times>0){
			 
			System.out.println("Incorrect Password. You have "+times+" attempts remaining before system lockout.");
			
	        }
	        else if(!guess.equals(answer)&&times==0){
	        	System.out.println("Your account has been disabled for 24 hours. The authorities have been notified");
	        }

          else {
			System.out.println("Access granted, welcome.");
		}
		
	}
		
		
		
	}
	
		
	}
	
