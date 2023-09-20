import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] w_score = new int[10];
		int[] k_score = new int[10];
		
		for(int i=0;i<10;i++) {
			w_score[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<10;i++) {
			k_score[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(w_score);
		Arrays.sort(k_score);
		
		int sum_w = 0;
		int sum_k = 0;
		for(int i=7;i<10;i++) {
			sum_w += w_score[i];
			sum_k += k_score[i];
		}
		
		System.out.println(sum_w + " " + sum_k);
	}
}
