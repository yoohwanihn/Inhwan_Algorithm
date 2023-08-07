import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int Sum_Youngsik = 0;
		int Sum_Minsik = 0;
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<N;i++) {
			int time = Integer.parseInt(st.nextToken());
			Sum_Youngsik += ((time/30)+1) * 10;
			Sum_Minsik += ((time/60)+1) * 15;
		}
		
		if(Sum_Youngsik<Sum_Minsik) {
			System.out.println("Y " + Sum_Youngsik);
		}
		else if(Sum_Youngsik > Sum_Minsik) {
			System.out.println("M " + Sum_Minsik);
		}
		else {
			System.out.println("Y M " + Sum_Minsik);
		}
		br.close();
	}
}