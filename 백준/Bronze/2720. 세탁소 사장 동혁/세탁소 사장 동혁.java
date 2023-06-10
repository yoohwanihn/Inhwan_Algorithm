import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int C = sc.nextInt();
			int[] money = new int[4];
			money[0] = C/25;
			C=C%25;
			money[1] = C/10;
			C=C%10;
			money[2] = C/5;
			C=C%5;
			money[3] = C;
			for(int j=0;j<money.length;j++) {
				System.out.print(money[j] + " ");
			}
		}
	}
}