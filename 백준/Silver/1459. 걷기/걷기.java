import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		long x = Integer.parseInt(st.nextToken());
		long y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken()); // 직선 시간
		int s = Integer.parseInt(st.nextToken()); // 대각선 시간

		long temp1 = 0;
		long temp2 = 0;
		long temp3 = 0;
		
		temp1 = (x+y)*w;	// 직선으로만 갈 경우
		temp2 = Math.min(x,y)*s + Math.abs(x-y)*w;	// x,y중 작은 곳 까지만 대각선으로 가고 나머지 직선으로 갈 경우
		
		//대각선으로만 갈 경우
		if((x+y)%2==0) {	// x+y의 합이 짝수이면 대각선으로만 이동할 수 있음.
			temp3 = Math.max(x,y)*s;
		}
		else {		// x+y의 합이 홀수이면 대각선으로 이동할 수 없기에 x,y의 최대길이에 1번을 덜 이동한 후 직선으로 1회 이동
			temp3 = (Math.max(x,y)-1)*s+w;
		}
		System.out.println(Math.min(temp1, Math.min(temp2, temp3)));
	}
}