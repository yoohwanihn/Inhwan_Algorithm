import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(long i=0;i<N;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine()," ");
        	long a = Long.parseLong(st.nextToken());
        	long b = Long.parseLong(st.nextToken());
        	long lcd = a*b/LCD(a,b);
        	sb.append(lcd + "\n");
        }
        System.out.println(sb.toString());
	}
	
	public static long LCD(long a, long b) {
		long temp;
		while(b!=0) {
			temp = a;
			a = b;
			b = temp%b;
		}
		return a;
	}
}