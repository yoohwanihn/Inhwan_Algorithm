import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
        //String.split() 메소드를 활용하면 틀림!!
		StringTokenizer st = new StringTokenizer(S," ");
		System.out.println(st.countTokens());	
	}
}