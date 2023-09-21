import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = N;
		for(int i=0;i<N;i++) {
			boolean[] alp = new boolean[26];
			String str = br.readLine();
			alp[str.charAt(0)-'a'] = true;
			for(int j=1;j<str.length();j++) {
				char ch = str.charAt(j);
				if(ch==str.charAt(j-1)) {
					continue;
				}
				else if(alp[ch-'a']) {
					cnt--;
					break;
				}
				alp[ch-'a'] = true;
			}	
		}
		System.out.println(cnt);
	}
}