import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int T = Integer.parseInt(br.readLine());
       StringTokenizer st ;
       int[] arr = new int[7];
       
       for(int i=0;i<T;i++) {
    	   int sum = 0;
    	   int min = Integer.MAX_VALUE;
    	   st = new StringTokenizer(br.readLine()," ");
    	   for(int j=0;j<arr.length;j++) {
			   arr[j] = Integer.parseInt(st.nextToken());
    		   if(arr[j]%2==0) {
    			   sum += arr[j];
    			   if(arr[j]<min) {
    				   min = arr[j];
    			   }
    		   }
    	   }
    	   System.out.println(sum + " " + min);
       }
    }
}