import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = sc.nextInt();
		for(int i=0;i<N-1;i++) {
			int b = sc.nextInt();
			int sub = gcd(a, b);
			System.out.println(a/sub + "/" + b/sub);
		}
	}
	//유클리드 호제법
	public static int gcd(int a, int b) {
		while(b!=0){
            int tmp = a;
            a=b;
            b=tmp%b;
        }
        return a;
	}
}

