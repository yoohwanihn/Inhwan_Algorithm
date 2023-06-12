import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int scoreA = 100;
		int scoreB = 100;
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==b) {
				continue;
			}
			else if(a>b)	{
				scoreB -= a;
			}
			else {
				scoreA -= b;
			}
		}
		System.out.println(scoreA);
		System.out.println(scoreB);
	}
}