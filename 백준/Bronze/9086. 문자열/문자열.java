import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			String str = sc.next();
			char a =str.charAt(0);
			char b = str.charAt(str.length()-1);
			System.out.printf("%c%c\n",a,b);
		}
	}
}