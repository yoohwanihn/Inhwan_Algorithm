import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	private static boolean prime[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int T = Integer.parseInt(st.nextToken());
		prime = new boolean[10001];
		
		isPrime();
		
		for(int i=0;i<T;i++) {
			int n = Integer.parseInt(br.readLine());
			//짝수이기 때문에 두 수를 2로 나눠도 됨
			int down = n/2;
			int up = n/2;
			while(true) {
				if(!prime[down] && !prime[up]) {
					break;
				}
				down--;
				up++;
			}
			System.out.println(down + " " + up);
		}
	}
	
	public static void isPrime() {
		prime[0] = true;
		prime[1] = true;
		for(int i=2;i<=Math.sqrt(prime.length);i++) {
			if(prime[i]) continue;
			for(int j=i*i;j<prime.length;j+=i) {
				prime[j] = true;
			}
		}
	}
}