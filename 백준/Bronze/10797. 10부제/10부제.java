import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] car = new int[5];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int cnt = 0;
		for(int i=0;i<car.length;i++) {
			car[i] = Integer.parseInt(st.nextToken());
			if(car[i]==N) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}