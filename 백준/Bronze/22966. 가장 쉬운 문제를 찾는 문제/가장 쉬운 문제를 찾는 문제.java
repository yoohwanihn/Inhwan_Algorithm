import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int min = Integer.MAX_VALUE;
		String result = "";
		for(int i=0;i<N;i++) {
			String[] str = br.readLine().split(" ");
			if(Integer.valueOf(str[1])<min) {
				min = Integer.valueOf(str[1]);
				result = str[0];
			}
		}
		System.out.println(result);
	}
}