import java.util.*;
public class Warmup  {
	public static void main(String[] args) {
		//main
		//q1
		int i=0;
		int r=-10;
		while(i<100){
		 System.out.println(r+",");
          r=r+5;
          i=i+1;
         
         
		}
		//q2
		int j=0;
		double r_j=10.0;
		while(j<40){
			System.out.println(r_j);
			r_j=r_j*1.1;
			j=j+1;
		}
		//q3
		int k=0;
		int r_k=7;
		int interval=1;
		while(k<75){
			System.out.println(r_k);
			interval=interval+2;
			r_k=r_k+interval;
			k=k+1;
		}
		//q4
		int l=0;
		double r_l=3;
		while(l<1500){
			
			if(r_l%2==0){
				System.out.println(r_l*(-1));
			}
			else{
				System.out.println(r_l*1);
			}
			r_l=r_l+1;
			l=l+1;
			
			
		}
	}
}
