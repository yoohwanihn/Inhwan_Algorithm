import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] p = new int[N];
		p[0]=1;
		p[1]=1;
		for(int i=2;i<N;i++) {
			p[i]=p[i-1]+p[i-2];
		}
		System.out.print(p[N-1] + " " + (N-2));
	}
}