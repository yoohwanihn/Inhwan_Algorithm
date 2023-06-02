import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		sc.close();
		System.out.println(fibonaci(number));
    }
	public static long fibonaci(long n) {
		if(n>1) {
			return fibonaci(n-1)+ fibonaci(n-2);
		}
		else if(n==1) {
			return 1;
		}
		else return 0;
	}
}
