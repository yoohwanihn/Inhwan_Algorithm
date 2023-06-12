import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int N = sc.nextInt();
			int Max = Integer.MIN_VALUE;
			int Min = Integer.MAX_VALUE;
			int MaxGap = 0;
			ArrayList<Integer> score = new ArrayList<>();
			for(int j=0;j<N;j++) {
				score.add(sc.nextInt());
				if(score.get(j)>Max) {
					Max = score.get(j);
				}
				if(score.get(j)<Min) {
					Min = score.get(j);
				}
			}
			Collections.sort(score);
			for(int j=0;j<score.size()-1;j++) {
				int gap = score.get(j+1)-score.get(j);
				if(MaxGap<gap) {
					MaxGap = gap;
				}
			}
			System.out.println("Class " + (i+1));
			System.out.println("Max " + Max + ", " + "Min " + Min + ", " + "Largest gap " + MaxGap);
		}
	}
}