import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int[] A = new int[N];
        Integer[] B = new Integer[N];
        int sum = 0;
        for(int i=0;i<A.length;i++) {
        	A[i] = sc.nextInt();
        }
        for(int i=0;i<B.length;i++) {
        	B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B,Collections.reverseOrder());
        for(int i=0;i<A.length;i++) {
        	sum+=(A[i]*B[i]);
        }
        System.out.print(sum);
    }
}
