import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static boolean[] prime;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int t = Integer.parseInt(br.readLine());
		prime = new boolean[1000001];
		isPrime();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			int cnt = 0;
			
			int down = n/2;
			int up = n/2;
			
			while(down>=2) {
				if(!prime[down]&&!prime[up]) {
					cnt++;
				}
				down--;
				up++;
			}
			sb.append(cnt+"\n");
		}
		System.out.println(sb.toString());
	}
	public static void isPrime() {
		prime[0] = true;
		prime[1] = true;
		for(int i=2;i<=Math.sqrt(prime.length);i++) {
			if(prime[i]) {
				continue;
			}
			for(int j=i*i; j<prime.length;j+=i) {
				prime[j] = true;
			}
		}
		
	}
}

