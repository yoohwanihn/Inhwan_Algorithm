import java.util.Scanner;
import java.util.Arrays;

public class Main{
	static int N, M;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		N = sc.nextInt();
		arr = new int[N];
		// input 값
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		M = sc.nextInt();
		
		for(int i=0;i<M;i++) {
			int search = sc.nextInt();
			if(binarySearch(search)) {
				sb.append("1 ");
			}
			else {
				sb.append("0 ");
			}
		}
		System.out.println(sb.toString());
		
	}
	public static boolean binarySearch(int n) {
		int low = 0;
		int high = N-1;
		
		while(high>=low) {
			int midindex = (high+low) / 2 ;
			int mid = arr[midindex];
			if(n>mid) {
				low = midindex+1;
			}else if(n<mid) {
				high = midindex-1;
			}
			else {
				return true;
			}
		}
		return false;
	}
}