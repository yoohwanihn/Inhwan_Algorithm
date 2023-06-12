import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		for(int i=0;i<C;i++) {
			int[] score = new int[sc.nextInt()];
			int sum = 0;
			for(int j=0;j<score.length;j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			int avg = sum/score.length;
			int count = 0;
			for(int j=0;j<score.length;j++) {
				if(score[j]>avg) {	
					count=count+100;
				}
			}
			//1000을 곱하고 1000.0으로 나누는 이유는 소수점 3째자리까지 표현하기 위함이다. 
			//Math.rount() 메소드는 소수 첫째자리에서 반올림하기 때문에 1000을 곱하고 1000.0으로 나누어 소수 셋째자리에서 반올림한 값을 구한다.
			double result = Math.round((double)count/score.length*1000)/1000.000;
			System.out.printf("%.3f",result);
			System.out.print("%\n");
		}
	}
}