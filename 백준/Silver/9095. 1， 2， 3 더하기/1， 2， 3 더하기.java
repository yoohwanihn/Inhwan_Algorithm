import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int[] dp = new int[12];
		StringBuilder sb = new StringBuilder();
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		dp[4] = 7;
		
		for(int i=5;i<dp.length;i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		
		for(int i=0;i<T;i++) {
			sb.append(dp[Integer.parseInt(br.readLine())]+"\n");
		}
	
		System.out.println(sb.toString());
		
 	}
}