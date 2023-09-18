import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		ArrayList<Integer> li = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			li.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(li,Collections.reverseOrder());
		
		for(int i=1;i<li.size();i++) {
			sum += li.get(0)+li.get(i);
		}
		
		System.out.println(sum);
 	}
}