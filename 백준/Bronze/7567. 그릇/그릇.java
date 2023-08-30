import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine();
       
       int length = 10;
       for(int i=0;i<str.length()-1;i++) {
    	   if(str.charAt(i+1) == str.charAt(i)) {
    		   length += 5;
    	   }else {
    		   length += 10;
    	   }
       }
       System.out.println(length);
    }
}

