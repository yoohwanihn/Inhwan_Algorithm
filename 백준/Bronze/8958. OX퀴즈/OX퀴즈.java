import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			int sum = 0;
			String[] str = br.readLine().split("X");
			for(int j=0;j<str.length;j++) {
				int count = 0;
				for(int k=0;k<str[j].length();k++) {
					count++;
					sum += count;
				}
			}
			System.out.println(sum);
		}
	}
}