import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		while(K>0) {
			if(N/2>=M) {
				N--;
			}
			else if(N%2==1) {
				N--;
			}
			else {
				M--;
			}
			K--;
		}
		System.out.println(N/2>M ? M : N/2);
	}
}