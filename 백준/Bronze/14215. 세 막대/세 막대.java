import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] tri = new int[3];
		
		tri[0] = sc.nextInt();
		tri[1] = sc.nextInt();
		tri[2] = sc.nextInt();
		
		Arrays.sort(tri);
		
		if(tri[2]>=tri[0]+tri[1]) {
			tri[2] = tri[0]+tri[1]-1;
		}
		
		int sum = 0;
		
		for(int i : tri) {
			sum += i;
		}
		
		System.out.println(sum);
	}
}