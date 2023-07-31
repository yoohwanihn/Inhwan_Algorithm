import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] fibo = new int [1000];
		
		fibo[0] = 0;
		fibo[1] = 1;
		
		for(int i=2;i<1000;i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		System.out.println(fibo[sc.nextInt()]);
	}
}
