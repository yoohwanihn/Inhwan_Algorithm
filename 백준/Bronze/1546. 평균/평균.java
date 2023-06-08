import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[] exam = new double[sc.nextInt()];
		double max = 0;
		double sum = 0;
		//입력하고 최대값 저장해놓기
		for(int i=0;i<exam.length;i++) {
			exam[i] = sc.nextDouble(); 
			if(exam[i]>max) {
				max = exam[i];
			}
		}
		sc.close();
		
		//조건에 맞게 값 수정하고 더하기
		for(int i=0;i<exam.length;i++) {
			exam[i]=exam[i]*100/max;
			sum += exam[i];
		}
		System.out.print(sum/exam.length);
	}
}