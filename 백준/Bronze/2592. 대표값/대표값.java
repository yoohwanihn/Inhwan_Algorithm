import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum1 = 0;
		int[] arr = new int[10];
		int[] list = new int[10];
		int mode = 0;
		int max = 0;
		
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<10;i++) {
			sum1 += arr[i];
			for(int j=0;j<10;j++) {
				if(arr[i]==arr[j]) {
					list[i]++;
				}
			}
		}
		
		for(int i=0;i<10;i++) {
			if(list[i]>max) {
				max = list[i];
			}
		}
		for(int i=0;i<10;i++) {
			if(list[i]==max) {
				mode = arr[i];
			}
		}
		System.out.println(sum1/10);
		System.out.println(mode);
	}
}