import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		int[] tri = new int [3];
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			tri[0] = Integer.parseInt(st.nextToken());
			tri[1] = Integer.parseInt(st.nextToken());
			tri[2] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(tri);
			
			if(tri[2]==0) {
				break;
			}
			
			if(tri[2] * tri[2] == tri[0] * tri[0] + tri[1] * tri[1]) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
		}
		
	}
}