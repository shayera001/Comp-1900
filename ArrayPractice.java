import java.util.*;
public class ArrayPractice{
	public static void main(String[] args) {
		//main
		int[] data={15,15,13,14};
		double[]x={15.0,15.0,13.0,14.0};
		String[]h1={"hiking", "cooking", "world domination"};
		String[]h2={"sleeping", "hiking"};
		System.out.println(countAboveThreshold(data,13));
		System.out.println( Arrays.toString(computeStats(x)));
		System.out.println(findCommonHobbies(h1,h2));
	}
	public static int countAboveThreshold(int[] data, int n){
		//return number of days;
		int days=0;
		for(int i:data){
			if(i>n){
				days++;
			}
		}
		return days;
	}
	public static double[] computeStats(double[] x){
		double min=x[0];double max=0;double sum=0.0;
         for(double i:x){
            if(i<min)min=i;
         }
         for(double i:x){
         	if(i>max)max=i;
         }
         for(double i:x){
         	sum+=i;
         }
         double []result={min,max,sum/x.length};
         return result;
	}
	public static ArrayList<String> findCommonHobbies(String []h1, String[] h2){
		//find the array that contains the elements in both inputs;
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < h1.length; i++)
		{
			for (int j = 0; j < h2.length; j++)
			{
				if(h1[i].equals(h2[j]))
				{
				result.add(h1[i]);
				}
			}
		}
		return result;
	}
}