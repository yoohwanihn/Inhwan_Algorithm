import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String result = "";
		for(char a='a';a<='z';a++) {
			result += S.indexOf(a) +" ";
		}
		System.out.println(result);
	}
}