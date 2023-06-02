import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] div = new int[N];
		for(int i=0;i<N;i++) {
			div[i] = sc.nextInt();
		}
		Arrays.sort(div);
		System.out.print(div[0]*div[N-1]);
    }
}