import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int count = 0;
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>=2) {
				count+=decimal(arr[i]);
			}
		}
		System.out.println(count);
    }
	public static int decimal(int m) {
		for(int i=2;i<m;i++) {
			if(m%i==0) {
				return 0;
			}
		}
		return 1;
	}
}
