import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int result  = reverse(reverse(n1) + reverse(n2));
		System.out.println(result);
	}
	
	public static int reverse(int n) {
		String str = "";
		while(n>0) {
			str += n%10;
			n = n/10;
		}
		return Integer.parseInt(str);
	}
}