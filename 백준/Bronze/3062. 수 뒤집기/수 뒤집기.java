import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<N;i++) {
        	int num = Integer.parseInt(br.readLine());
        	int tmp = num;
        	String reverse_num = "";
        	while(tmp>0) {
        		reverse_num += tmp%10;
        		tmp = tmp/10;
        	}
        	num = num + Integer.parseInt(reverse_num);
        	
        	tmp = num;
        	reverse_num = "";
        	while(tmp>0) {
        		reverse_num += tmp%10;
        		tmp = tmp/10;
        	}
        	if(Integer.parseInt(reverse_num) == num) {
        		sb.append("YES\n");
        	}
        	else {
        		sb.append("NO\n");
        	}
        }
        System.out.print(sb.toString());
	}
}