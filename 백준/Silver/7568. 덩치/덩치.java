import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] P = new int[N][2];
        for(int i=0;i<N;i++){
            P[i][0]=sc.nextInt();
            P[i][1]=sc.nextInt();
        }
        for(int i=0;i<P.length;i++) {
        	int count = 1;
        	for(int j=0;j<P.length;j++) {
        		if(P[i][0]<P[j][0]&&P[i][1]<P[j][1]) {
        			count++;
        		}
        	}
        	System.out.print(count + " ");
        }
    }
}