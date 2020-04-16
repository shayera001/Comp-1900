import java.util.*;
public class StatsAnalyzer{
	public static void main(String[] args) {
		//main
		int [][]scores={{20,27,16,23,20,27,18},{8,18,14,17,9,12,0},{34,19,25,22,19,25,31},{17,8,11,34,15,0,9},{2,0,3,0,10,2,4}};
		int p=6;
		int g=6;
		System.out.println(playerTotalPoints(scores,2));
		System.out.println(playerAveragePPG(scores,2));
		System.out.println(bestOverallPlayer(scores));
		System.out.println(teamPointsInGame(scores,6));
		System.out.println(teamPointsRangeInGame(scores,6));
		System.out.println(highestScoringPlayer(scores));
	}
		public static int playerTotalPoints(int[][] scores, int p){
			int total=0;
				for(int j=0;j<=6;j++){
				total+=scores[p][j]; 
				}
				return total;
			

		}
		public static double playerAveragePPG(int[][] scores, int p){
			return (double)playerTotalPoints(scores,p)/7;

		}
		public static int bestOverallPlayer(int[][] scores){
			int max=0;
			int player=0;
			for(int i=0;i<=4;i++){
				if(playerTotalPoints(scores,i)>max){
					max=playerTotalPoints(scores,i);
					player=i;
				}
			}
			return player;


		}
		public static int teamPointsInGame(int[][] scores, int g){
			int total=0;
			for(int i=0;i<=4;i++){
				total+=scores[i][g];
			}
			return total;
           

		}
		public static int teamPointsRangeInGame(int[][] scores, int g){
			int min=scores[0][g];
			int max=0;
			for(int i=0;i<=4;i++){
				if(scores[i][g]>max){
					max=scores[i][g];
				}
				if(scores[i][g]<min){
					min=scores[i][g];
				}
			}
			return (max-min);

		}
		 public static int highestScoringPlayer(int[][] scores){
		 	int highest=0;
		 	int player=0;
		 	for(int j=0;j<=4;j++){
		 		for(int i=0;i<=6;i++){
		 			if(scores[j][i]>highest){
		 				highest=scores[j][i];
		 				player=j;
		 			}
		 		}
		 	}
		 	return player;

		 }

}