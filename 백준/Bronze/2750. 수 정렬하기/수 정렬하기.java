import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for(int i=0;i<b.length;i++) {
        	b[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(b);
        System.out.println(b[0]);
        for(int i=1;i<b.length;i++) {
        	if(b[i-1]==b[i]) {
        		continue;
        	}
        	System.out.println(b[i]);
        }
    }
}