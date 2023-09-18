import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] melody = new int[8];
		
		for(int i=0;i<melody.length;i++) {
			melody[i] = Integer.parseInt(st.nextToken());
		}
		
		if(melody[0]==1) {
			for(int i=1;i<melody.length;i++) {
				if(melody[i]==i+1) {
					
				}
				else {
					System.out.println("mixed");
					return;
				}
			}
			System.out.println("ascending");
		}
		else if(melody[0]==8) {
			for(int i=1;i<melody.length;i++) {
				if(melody[i]==8-i) {
				}
				else {
					System.out.println("mixed");
					return;
				}
			}
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
 	}
}