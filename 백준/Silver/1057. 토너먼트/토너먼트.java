import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int round = sc.nextInt();
		int jimin = sc.nextInt();
		int hansu = sc.nextInt();
		
		int result = Search(jimin, hansu);
		
		System.out.print(result);
		
	}
	public static int Search(int a, int b) {
		
		int cnt = 0;
		while(a!=b) {
			a = a/2 + a%2;
			b = b/2 + b%2;
			cnt++;
		}
		return cnt;
	}
}