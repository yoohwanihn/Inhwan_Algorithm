import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int[] P = new int[N];
        int sum = 0;
        for(int i=0;i<P.length;i++) {
        	P[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(P);
        sum = P[0];
        for(int i=1;i<P.length;i++) {
        	P[i] += P[i-1];
        	sum+=P[i];
        }
        System.out.println(sum);
    }
}
