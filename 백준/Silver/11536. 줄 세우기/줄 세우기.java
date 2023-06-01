import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        String[] str = new String[n];
        String[] rstr = new String[n];
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<name.length;i++) {
        	name[i] = sc.next();
        	str[i] = name[i];
        	rstr[i] = name[i];
        }
        Arrays.sort(str);
        Arrays.sort(rstr, Collections.reverseOrder());
        for(int i=0;i<name.length;i++) {
        	if(name[i].equals(str[i])) {
        		count1++;
        	}
        	if(name[i].equals(rstr[i])) {
        		count2++;
        	}
        }
        if(count1 == name.length) {
        	System.out.println("INCREASING");
        }
        else if(count2 == name.length) {
        	System.out.println("DECREASING");
        }
        else {
        	System.out.println("NEITHER");
        }
    }
}
