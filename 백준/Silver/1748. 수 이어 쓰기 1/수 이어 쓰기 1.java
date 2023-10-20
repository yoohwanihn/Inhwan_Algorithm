import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		long cnt = 0;
		int add = 1;
		int div = 10;
		
		for(int i=1; i<=N;i++) {
			if(i%div==0) {
				add++;
				div *= 10;
			}
			cnt += add;
		}
		
		System.out.println(cnt);
		
	}
}
