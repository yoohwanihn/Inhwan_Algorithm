import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			Set<Integer> set = new HashSet<>();
			int n = Integer.parseInt(br.readLine());
			while(n>0) {
				set.add(n%10);
				n=n/10;
			}
			System.out.println(set.size());
		}
	}
}