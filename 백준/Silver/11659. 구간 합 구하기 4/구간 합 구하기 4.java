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
		
		int[] arr = new int[N];
		int[] sum = new int[N];
		st = new StringTokenizer(br.readLine()," ");
		arr[0] = Integer.parseInt(st.nextToken());
		sum[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum[i] = sum[i-1] + arr[i];
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int start = Integer.parseInt(st.nextToken())-1;
			int end = Integer.parseInt(st.nextToken())-1;
			if(start==0) {
				int result = sum[end];
				System.out.println(result);
			}
			else {
				int result = sum[end] - sum[start-1];
				System.out.println(result);
			}
		}
	}
}