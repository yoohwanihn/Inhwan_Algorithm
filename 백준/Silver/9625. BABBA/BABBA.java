import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		
		int[][] dp  = new int [46][2];
		
		dp[0][0] = 1;
		dp[0][1] = 0;
		
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		for(int i=2;i<=45;i++) {
			dp[i][0] = dp[i-1][1];
			dp[i][1] = dp[i-1][1]+dp[i-1][0];
		}
		
		System.out.println(dp[K][0] + " " + dp[K][1]);
 	}
}