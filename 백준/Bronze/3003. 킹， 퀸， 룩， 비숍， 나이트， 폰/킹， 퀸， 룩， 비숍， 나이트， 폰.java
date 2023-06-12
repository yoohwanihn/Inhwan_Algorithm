import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] chess = {1,1,2,2,2,8};
		int[] input = new int[6];
		//입력
		for(int i=0;i<input.length;i++) {
			input[i] = sc.nextInt();
		}
		//출력
		for(int i=0;i<input.length;i++) {
			System.out.print(chess[i] - input[i] + " ");
		}
		
	}
}