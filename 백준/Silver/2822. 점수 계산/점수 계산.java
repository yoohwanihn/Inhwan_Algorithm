import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[8];
		int[] temp = new int[8];
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			temp[i] = arr[i];
		}
		
		Arrays.sort(temp);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>temp[2]) {
				sb.append((i+1)+ " ");
				sum += arr[i];
			}
		}
		System.out.println(sum);
		System.out.println(sb.toString());
	}
}