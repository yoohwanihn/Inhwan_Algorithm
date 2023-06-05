import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int sumA = 0;
        int sumB = 0;
        int maxdiv = 1;
        if(A>B) {
        	for(int i=2;i<=B;i++) {
            	if(A%i==0 && B%i==0) {
            		maxdiv = i;
            	}
            }
        }
        else {
        	for(int i=2;i<=A;i++) {
        		if(A%i==0 && B%i==0) {
            		maxdiv = i;
            	}
        	}
        }
        sumA = (A*D+B*C)/maxdiv;
        sumB = B*D/maxdiv;
        maxdiv = 1;
        for(int i=2;i<=sumA;i++) {
        	if(sumA%i==0 && sumB%i==0) {
        		maxdiv = i;
        	}
        }
        sumA = sumA/maxdiv;
        sumB = sumB/maxdiv;
        System.out.print(sumA + " " + sumB);
	}
}
