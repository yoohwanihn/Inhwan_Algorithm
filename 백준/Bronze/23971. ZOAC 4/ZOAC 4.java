import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int H = Integer.parseInt(str[0]);
        int W = Integer.parseInt(str[1]);
        int N = Integer.parseInt(str[2]);
        int M = Integer.parseInt(str[3]);
        int count = 0;
        
        int height = (H-1)/(N+1)+1;
        int width = (W-1)/(M+1)+1;
        System.out.println(height * width);
	}
}