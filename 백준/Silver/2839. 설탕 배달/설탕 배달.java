import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int count = 0;
		
		while(true) {
			if(N%5==0) {
				count = count + N/5;
				break;
			}
			else if(N>0) {
				N = N-3;
				count++;
			}
			else { 
				count = -1;
				break;
			}
		}
		System.out.println(count);
	}
}