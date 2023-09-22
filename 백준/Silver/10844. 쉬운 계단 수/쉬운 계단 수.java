import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[][] dp = new long[N+1][10];
		
		for(int i=1;i<dp[1].length;i++) {
			dp[1][i] = 1;
		}
		for(int i=2;i<dp.length;i++) {
			for(int j=0;j<dp[i].length;j++) {
				if(j==9) {
					dp[i][9] = dp[i-1][8] % 1000000000;
				}
				 else if(j==0) {    
                    dp[i][0] = dp[i-1][1] % 1000000000;
                }
				 else {
					 dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
				 }
			}
		}
		
		long result = 0;
		for(int i=0;i<dp[N].length;i++) {
			result += dp[N][i];
		}
		System.out.println(result%1000000000);
	}
}