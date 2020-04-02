import java.util.*;
public class MethodsPractice{
	public static void main(String[] args) {

		//main
		planParty(9,14,6);
		planParty(4,6,3);
		System.out.println(planParty2(9,14,6));
		System.out.println(planParty2(4,6,3));
		System.out.println(retirementBalance(1000, 6, 1000, 2, 35));
		System.out.println(retirementBalance(1000, 6, 1000, 0, 35));
		System.out.println(retirementBalance(0, 6, 6000, 2, 40));
		System.out.println(retirementBalance(0, 6, 6000, 0, 40));
	}
	public static void planParty(int f, int c, int p){
		int n=(f+1)*c;//estimated total needed cans
		while(n%p!=0){
			n++;
		}
		int remain=n%p;
		int packs=n/p;
		System.out.println(packs+" pack(S) "+remain+" extra can(s) ");
	
	}
	public static int planParty2(int f, int c, int p){
		int n=(f+1)*c; //estimated total needed cans
		while(n%p!=0){
			n++;
		}
		int packs=n/p;
		return packs;
	}
	public static double retirementBalance(double initial, double rate, double extraInitial, double extraGrowth, int years){
	      double yearStart=initial;
	      double yearEnd=0;
	      double sum=0;
	      int y=0;
	      while(y<=years-1){
	      	yearEnd=yearStart*(1+rate/100)+extraInitial*Math.pow((1+extraGrowth/100),y);
	        sum+=yearEnd;
	        yearStart=yearEnd;

	      	y++;

	      }
	      return yearEnd;
	}
}