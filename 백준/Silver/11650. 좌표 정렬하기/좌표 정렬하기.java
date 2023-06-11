import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] xy = new int[sc.nextInt()][2];
		for(int i=0;i<xy.length;i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
		}
		
		//lambda 함수로 Arrays의 sort 메소드 익명함수 구현.
		Arrays.sort(xy,(xy1, xy2)->{
			//x 값이 같을 경우 
			if(xy1[0]==xy2[0]) {
				return xy1[1]-xy2[1];
			}
			//x 값이 다를 경우
			else {
				return xy1[0]-xy2[0];
			}
		});
		
		for(int i=0;i<xy.length;i++) {
			System.out.println(xy[i][0] + " " + xy[i][1]);
		}
	}
}