import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] N = new int[9];
		int max = Integer.MIN_VALUE;
		int idx = -1;
		for(int i=0;i<N.length;i++) {
			N[i]=sc.nextInt();
		}
		for(int i=0;i<N.length;i++) {
			if(N[i]>max) {
				max = N[i];
				idx = i;
			}
		}
		System.out.println(N[idx]);
		System.out.println(idx+1);
    }
}
