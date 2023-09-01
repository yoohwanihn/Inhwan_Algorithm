import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int p = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			String result = str.substring(0, p-1);
			result += str.substring(p);
			System.out.println(result);
		}
	}
}