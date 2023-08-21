import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] ref = new int[N][5];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			ref[i][0] = Integer.parseInt(st.nextToken());
			ref[i][1] = Integer.parseInt(st.nextToken());
			ref[i][2] = Integer.parseInt(st.nextToken());
			ref[i][3] = Integer.parseInt(st.nextToken());
			ref[i][4] = Integer.parseInt(st.nextToken());
			Arrays.sort(ref[i]);
			if(ref[i][3]-ref[i][1]>=4) {
				System.out.println("KIN");
				continue;
			}
			System.out.println(ref[i][1]+ref[i][2]+ref[i][3]);
		}
	}
}