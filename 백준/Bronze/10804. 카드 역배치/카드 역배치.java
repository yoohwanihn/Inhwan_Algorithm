import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int [20];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<10;i++) {
			int start = sc.nextInt() - 1;
			int last = sc.nextInt() - 1;
			
			while(start<last) {
				int tmp = arr[start];
				arr[start++] = arr[last];
				arr[last--] = tmp;
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i] + " ");
		}
		
		System.out.println(sb.toString());
	}
}
