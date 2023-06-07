import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] point = new int[N];
		int count = 0;
		for(int i=0;i<point.length;i++) {
			point[i] = sc.nextInt();
		}
		sc.close();
		for(int i=point.length-1;i>=1;i--) {
			if(point[i-1]>=point[i]) {
				count = count + point[i-1] - point[i] + 1;
				point[i-1] = point[i] - 1 ;
			}
		}
		System.out.println(count);
	}
}
