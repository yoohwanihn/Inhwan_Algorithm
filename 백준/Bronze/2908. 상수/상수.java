import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		StringBuilder sba = new StringBuilder(a).reverse();
		StringBuilder sbb = new StringBuilder(b).reverse();
		
		int A = Integer.parseInt(sba.toString());
		int B = Integer.parseInt(sbb.toString());
		System.out.print(A > B ? A : B);
	}
}