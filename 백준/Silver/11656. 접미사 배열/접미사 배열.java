import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] result = new String[S.length()];
		for(int i=0;i<result.length;i++) {
			result[i] = S.substring(i);
		}
		Arrays.sort(result);
		for(String str : result) {
			System.out.println(str);
		}
	}
}