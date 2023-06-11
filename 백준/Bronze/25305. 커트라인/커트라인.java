import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<N;i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list,Collections.reverseOrder());
		System.out.print(list.get(k-1));
	}
}