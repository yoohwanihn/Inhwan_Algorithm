import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int F = sc.nextInt();
		
		int a = N/100;
		a = a*100;
		
		while(true) {
			if(a%F==0) {
				break;
			}
			a++;
		}
		if(a%100<10) {
			System.out.println("0" + a%100);
		}
		else {
			System.out.println(a%100);
		}
	}

}