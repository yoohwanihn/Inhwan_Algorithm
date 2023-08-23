import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        char[] carr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int size = carr.length;
        int[] count = new int[size];
        
        for(int i=0;i<str.length();i++) {
        	for(int j=0;j<size;j++) {
        		if(str.charAt(i)==carr[j]) {
        			count[j]++;
        			break;
        		}
        	}
        }
        
        int idx = 0;
        int max = 0;
        for(int i=0;i<count.length;i++) {
        	if(count[i]>max) {
        		max = count[i];
        		idx = i;
        	}
        }
        
        boolean duplication = false;
        for(int i=0;i<count.length;i++) {
        	if(count[i]==max && idx != i) {
        		duplication = true;
        	}
        }
        
        if(duplication) {
        	System.out.println("?");
        }
        else {
        	System.out.println(carr[idx]);
        }
	}
}