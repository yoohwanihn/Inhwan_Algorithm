import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		sc.close();
		System.out.println(fac(number));
    }
	public static long fac(long n) {
		if(n>1) {
			return fac(n-1) * n;
		}
		else return 1;
	}
}
