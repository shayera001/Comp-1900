import java.util.*;
public class Factorials {
	public static void main(String[] args) {
		//main
		Scanner in=new Scanner(System.in);
		long result=1;//result declared
		int i=1;//parameter
		System.out.println("Input your number: ");
		int number=in.nextInt();//input value
        while(i<=number){
        	result=result*i;
        	i++;
        	
        }//
        
		System.out.println("answer is : "+result);
	

	}
}