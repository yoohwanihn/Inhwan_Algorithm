import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=0;i<N;i++) {
			String input = br.readLine();
			input += input;
			if(input.contains(str)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}