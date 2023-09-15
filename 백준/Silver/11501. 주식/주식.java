import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<T;i++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			long sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<arr.length;j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			long max = arr[arr.length-1];
			for(int j=arr.length-2;j>=0;j--) {
				if(max>=arr[j]) {
					sum += max-arr[j];
				}
				else {
					max = arr[j];
				}
			}
			sb.append(sum + "\n");
		}
		System.out.println(sb.toString());
 	}
}