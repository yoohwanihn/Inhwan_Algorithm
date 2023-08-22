import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	static int[] count = new int[alphabet.length];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++) {
        	for(int j=0;j<alphabet.length;j++) {
        		if(str.charAt(i)==alphabet[j]) {
        			count[j]++; 
        			break;
        		}
        	}
        }
        for(int i=0;i<count.length;i++) {
        	sb.append(count[i] + " ");
        }
        System.out.println(sb.toString());    
	}
}