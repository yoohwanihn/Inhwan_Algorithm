import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        int count = 0;
        while(true) {
        	if(N%5==0) {
        		count+=N/5;
        		break;
        	}
        	else {
        		N = N-2;
        		count++;
        	}
        	if(N<0) {
        		count=-1;
        		break;
        	}
        }
        System.out.println(count);
	}
}