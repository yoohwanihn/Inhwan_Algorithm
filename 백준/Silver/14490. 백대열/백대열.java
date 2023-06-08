import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] str = S.split(":");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int sub = gcd(a,b);
		System.out.println(a/sub+":"+b/sub);
		
	}
	public static int gcd(int a, int b) {
		while(b!=0) {
			int temp = a;
			a = b;
			b = temp%b;
		}
		return a;
	}
}