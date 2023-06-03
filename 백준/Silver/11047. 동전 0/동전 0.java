import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] coin = new int[N];
        int count = 0;
        for(int i=0;i<coin.length;i++) {
        	coin[i] = sc.nextInt();
        }
        sc.close();
        while(K>0) {
        	for(int i=coin.length-1;i>=0;i--) {
        		if(K>=coin[i]) {
        			K=K-coin[i];
        			count++;
        			break;
        		}
        	}
        }
        System.out.println(count);
	}
}
