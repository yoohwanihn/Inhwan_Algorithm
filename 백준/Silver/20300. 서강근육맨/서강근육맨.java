import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] t = new long[N];
		long sonsil = 0;

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<t.length;i++) {
			t[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(t);
		
		if(t.length%2==0) {
			for(int i=0;i<t.length/2;i++) {
				long t_sonsil = t[i] + t[t.length-i-1];
				if(sonsil<t_sonsil) {
					sonsil=t_sonsil;
				}
			}
		}
		else {
			long t_sonsil = 0;
			for(int i=0;i<t.length/2;i++) {
				t_sonsil = t[i] + t[t.length-i-2];
				if(sonsil<t_sonsil) {
					sonsil=t_sonsil;
				}
			}
			t_sonsil = t[t.length-1]; 
			if(sonsil<t_sonsil) {
				sonsil=t_sonsil;
			}
		}
		System.out.println(sonsil);
 	}
}