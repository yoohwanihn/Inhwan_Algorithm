import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			int count = 0;
			st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			if(N==0) count++;
			for(int j=N;j<=M;j++) {
				int tmp = j;
				while(tmp>0) {
					if(tmp%10==0) {
						count++;
					}
					tmp /= 10;
				}
			}
			System.out.println(count);
		}
	}
}