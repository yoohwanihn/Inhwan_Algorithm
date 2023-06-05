import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		boolean A = sc.nextInt()==1;
		if(T>=12&&T<=16&&!A) {
			System.out.print(320);
        }
		else {
			System.out.print(280);
		}
	}
}
