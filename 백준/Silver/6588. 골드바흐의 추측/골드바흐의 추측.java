import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static boolean[] prime;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		prime = new boolean[1000001];
		isPrime();
		
		while(true) {
			int N = Integer.parseInt(br.readLine());
			if(N==0) {
				break;
			}

			int up = 2;
			int down = N-2;
			while(true) {
				if(!prime[up]&&!prime[down]) {
					System.out.println(N + " = " + up + " + " + down);
					break;
				}
				else if(up==down) {
					System.out.println("Goldbach's conjecture is wrong.");
					break;
				}
				up++;
				down--;
			}
		}
	}
	
	public static void isPrime() {
		prime[0] = true;
		prime[1] = true;
		for(int i=2;i<=Math.sqrt(prime.length);i++) {
			if(prime[i]) {
				continue;
			}
			for(int j=i*i;j<prime.length;j+=i) {
				prime[j] = true;
			}
		}
	}
}