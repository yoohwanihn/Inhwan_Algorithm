import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String x = br.readLine();
		int cnt = 0;
		
		while(true) {
			int tmp = 0;
			if(x.length()==1) {
				break;
			}
			for(int i=0; i<x.length(); i++) {
				tmp += x.charAt(i)-'0';
			}
			x = Integer.toString(tmp);
			cnt++;
		}
		
		int result = Integer.parseInt(x);
		
		System.out.println(cnt);
		if(result%3==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}