import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] rank = new int[N];
		
		for(int i=0;i<rank.length;i++) {
			rank[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(rank);
		
		long bulman = 0;
		for(int i=0;i<rank.length;i++) {
			bulman += Math.abs(rank[i]-(i+1));
		}
		
		System.out.println(bulman);
 	}
}