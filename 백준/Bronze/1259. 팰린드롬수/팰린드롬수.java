import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = 0;
		
		while(true) {
			StringBuilder sb = new StringBuilder();
			N = Integer.parseInt(br.readLine());
			if(N==0) {
				break;
			}
			sb.append(N).reverse();
			if(sb.toString().equals(String.valueOf(N))) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}
}