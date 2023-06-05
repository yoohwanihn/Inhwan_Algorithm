import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String[] number = N.split("");
        String answer = "";
        Arrays.sort(number,Collections.reverseOrder());
        for(String i : number) {
        	answer += Integer.parseInt(i);
        }
        System.out.println(Integer.parseInt(answer));
	}
}
