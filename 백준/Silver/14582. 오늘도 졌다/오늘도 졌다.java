import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int[] woolim = new int[9];
	static int[] startlink = new int[9];
	static int woolim_score = 0;
	static int startlink_score = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0;i<woolim.length;i++) {
			woolim[i]=Integer.parseInt(st.nextToken());
			woolim_score += woolim[i];
		}
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<startlink.length;i++) {
			startlink[i]=Integer.parseInt(st.nextToken());
			startlink_score += startlink[i];
		}
		if(woolim_score<startlink_score) {
			if(reversal()) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		else {
			System.out.println("No");
		}
	}
	
	public static boolean reversal(){
		int sum = 0;
		for(int i=0;i<9;i++) {
			sum += woolim[i];
			if(sum>0) {
				return true;
			}
			sum -= startlink[i];
		}
		return false;
	}
}