import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int div = gcd(num1,num2);
		System.out.println(div);
		System.out.println(num1*num2/div);
	}
	
	public static int gcd(int a,int b) {
		while(b!=0) {
			int temp = a;
			a = b;
			b = temp%b;
		}
		return a;
	}
}