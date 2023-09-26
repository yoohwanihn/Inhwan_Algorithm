import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer[] lope = new Integer[N];
		
		for(int i=0;i<lope.length;i++) {
			lope[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(lope,Comparator.reverseOrder());
		
		long result = Integer.MIN_VALUE;
		for(int i=0;i<lope.length;i++) {
			result = Math.max(result, lope[i]*(i+1));
		}
		System.out.println(result);
	}
}
