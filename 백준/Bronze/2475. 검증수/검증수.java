import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int sum = 0;
        for(int i=0; i<5; i++) {
        	int a = Integer.parseInt(st.nextToken());
        	sum += (a*a);
        }
        System.out.println(sum%10);
	}
}