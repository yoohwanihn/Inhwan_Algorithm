import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]); 
        int B = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);
        
        int day = (V-B)/(A-B);
        
        //나누어 떨어지지 않을 경우 하루 더 미끄러진 뒤에 올라가야함
        if((V-A)%(A-B)!=0) {
        	day++;
        }
        
        System.out.println(day);
	}
}