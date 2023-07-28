import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] p = new int[10];
		
		p[0] = sc.nextInt() + sc.nextInt();
		int max = 0;
		for(int i=1;i<p.length;i++) {
			p[i] = - sc.nextInt() + sc.nextInt() + p[i-1];
			if(p[i]>max) {
				max = p[i];
			}
		}
		System.out.print(max);
		
	}
}
