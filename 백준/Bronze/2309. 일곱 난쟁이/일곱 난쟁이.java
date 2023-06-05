import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		int sum = 0;
		int[] N = new int[9];
        int fake1 = 0;
        int fake2 = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<N.length;i++) {
			N[i] = sc.nextInt();
			sum += N[i];
		}
		sc.close();
		for(int i=0;i<N.length;i++) {
			for(int j=i+1;j<N.length;j++) {
				if(sum-N[i]-N[j]==100) {
					fake1 = N[i];
					fake2 = N[j];
                    break;
				}
			}
		}
		Arrays.sort(N);
		for(int i=0;i<N.length;i++) {
            if(fake1==N[i]||fake2==N[i]) continue;
		    System.out.println(N[i]);
		}
	}
}
