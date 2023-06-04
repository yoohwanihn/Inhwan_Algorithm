import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] bar = new int[N];
        int count = 1;
        for(int i=0;i<N;i++) {
        	bar[i] = sc.nextInt();
        }
        sc.close();
        int h = bar[N-1];
        for(int i=N-2;i>=0;i--) {
        	if(h<bar[i]) {
        		h=bar[i];
        		count++;
        	}
        }
        System.out.print(count);
	}
}
