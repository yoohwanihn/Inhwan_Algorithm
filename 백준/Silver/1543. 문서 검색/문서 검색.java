import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String doc = br.readLine();
		String word = br.readLine();
		doc = doc.replaceAll(word,"0");
		
		int cnt = 0;
		
		for(int i=0;i<doc.length();i++) {
			if(doc.charAt(i)=='0') {
				cnt++;
			}
		}
		System.out.println(cnt);
 	}
}