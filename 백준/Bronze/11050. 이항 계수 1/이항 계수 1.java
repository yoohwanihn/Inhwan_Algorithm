import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int result = 1;
	
		for(int i=0;i<N;i++) {
			result = result * (M-i) / (i+1);
		}
		
		System.out.print(result);
	}
}