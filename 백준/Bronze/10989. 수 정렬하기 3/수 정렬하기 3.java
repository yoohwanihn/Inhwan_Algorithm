import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int[] arr = new int[Integer.parseInt(br.readLine())];
		for(int i=0 ;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		Arrays.sort(arr);
		for(int i : arr) {
			sb.append(i+"\n");
		}
		System.out.println(sb);
	}
}