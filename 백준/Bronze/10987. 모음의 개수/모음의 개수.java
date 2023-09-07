import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] mo = {'a','e','i','o','u'};
		String Input = br.readLine();
		int count = 0;
		
		for(int i=0;i<mo.length;i++) {
			for(int j=0;j<Input.length();j++) {
				if(Input.charAt(j)==mo[i]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}