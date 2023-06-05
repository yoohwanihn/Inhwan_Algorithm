import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();
		if(B!=A) {
			System.out.println(Math.abs(B-A)-1);
			if(B>A) {
				for(long i=A+1;i<B;i++) {
					System.out.print(i + " ");
				}
			}
			else {
				for(long i=B+1;i<A;i++) {
					System.out.print(i + " ");
				}
			}
		}
		else {
			System.out.println(0);
		}
	}
}
