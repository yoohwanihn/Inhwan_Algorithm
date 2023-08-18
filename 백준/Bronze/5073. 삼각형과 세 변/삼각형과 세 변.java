import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] tri = new int[3];
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			tri[0] = a;
			tri[1] = b;
			tri[2] = c;
			if(tri[0] == 0 && tri[2] == 0) {
				break;
			}
			Arrays.sort(tri);
			if(tri[2]>=tri[0]+tri[1]) {
				System.out.println("Invalid");
				continue;
			}
			if(tri[0]==tri[2]) {
				System.out.println("Equilateral");
				continue;
			}
			if(tri[0]==tri[1] || tri[1]==tri[2]) {
				System.out.println("Isosceles");
				continue;
			}
			else {
				System.out.println("Scalene");
			}
		}
	}
}