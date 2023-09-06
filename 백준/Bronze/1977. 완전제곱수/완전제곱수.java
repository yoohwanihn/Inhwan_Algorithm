import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		int min = (int)Math.ceil(Math.sqrt(M));
		int sum = 0;
		for (int i = min; i <= Math.floor(Math.sqrt(N)); i++) {
			sum += i*i;
		}
	
		if (sum > 0) {
			System.out.println(sum);
			System.out.println(min*min);
		} 
		else {
			System.out.println(-1);
		}
	}
}