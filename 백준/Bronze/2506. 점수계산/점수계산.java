import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] score = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int sum = 0;
		for(int i=0;i<score.length;i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}

		int point = 0;
		for(int i=0;i<score.length;i++) {
			if(score[i]==0) {
				point=0;
			}
			else {
				sum+=++point;
			}
		}
		System.out.println(sum);
	}
}