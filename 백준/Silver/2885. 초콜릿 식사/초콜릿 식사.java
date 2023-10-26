import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		int size = 1;
		
		while(size<k) {
			size*=2;
		}

		int result_size = size;
		
		while(k>0) {
			if(size==k) {
				break;
			}
			if(size>k) {
				cnt++;
				size /= 2; 
			}
			else if(k>=size) {
				k= k-size;    
			}
		}
		System.out.println(result_size + " " + cnt);
	}
}