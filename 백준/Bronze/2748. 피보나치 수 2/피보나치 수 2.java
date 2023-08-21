import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] fibonaci = new long[91];
		fibonaci[0] = 0;
		fibonaci[1] = 1;
		for(int i=2;i<91;i++) {
			fibonaci[i] = fibonaci[i-1] + fibonaci[i-2];
		}
		System.out.println(fibonaci[N]);
	}
}