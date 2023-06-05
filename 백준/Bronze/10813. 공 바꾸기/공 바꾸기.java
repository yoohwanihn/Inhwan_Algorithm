import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int M = sc.nextInt();
        int[] ball = new int[N];
        for(int i=0;i<N;i++) {
        	ball[i] = i+1;
        }
        for(int i=0;i<M;i++) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int temp = ball[a-1];
        	ball[a-1] = ball[b-1];
        	ball[b-1] = temp;
        }
        for(int i=0;i<N;i++) {
        	System.out.print(ball[i] + " ");
        }
	}
}
