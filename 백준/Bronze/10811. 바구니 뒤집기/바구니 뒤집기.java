import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] ball = new int[N];
		
		//배열 초기화
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
		
		//순서 교환
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken())-1;
			int end = Integer.parseInt(st.nextToken())-1;
			while(start<end) {
				int tmp = ball[start];
				ball[start++] = ball[end];
				ball[end--] = tmp;
			}
		}
		//출력
		for(int i=0;i<ball.length;i++) {
			sb.append(ball[i] + " ");
		}
		System.out.print(sb.toString());
		br.close();
	}
}