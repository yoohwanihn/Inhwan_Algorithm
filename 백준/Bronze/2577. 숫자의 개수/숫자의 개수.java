import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int mul = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        int[] arr = new int[10];
     
        while(mul>0) {
        	int i = mul%10;
        	arr[i]++;
        	mul = mul/10;
        }
        
        for(int i=0;i<arr.length;i++) {
        	sb.append(arr[i] + "\n");
        }
        System.out.println(sb.toString());
	}
}