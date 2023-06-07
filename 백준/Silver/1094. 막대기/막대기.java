import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int count = 0;
		for(int i=64;i>=1;i=i/2) {
			if(X>=i) {
				X=X-i;
				count++;
			}
			if(X==0) {
				break;
			}
		}
		System.out.println(count);
	}
}