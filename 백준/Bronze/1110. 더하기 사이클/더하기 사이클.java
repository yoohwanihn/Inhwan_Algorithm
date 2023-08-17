import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 1;
		int num = 0;
		
		if(N<10) {
			num = N*11;
		}
		else {
			num = (N%10)*10+((N%10)+N/10)%10;
		}
		
		while(num != N) {
			num = (num%10)*10+((num%10)+num/10)%10;
			count++;
		}
		System.out.println(count);
	}
}