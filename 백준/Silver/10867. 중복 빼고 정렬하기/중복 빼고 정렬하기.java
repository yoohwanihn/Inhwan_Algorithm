import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<>();
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			hs.add(sc.nextInt());
		}
		ArrayList<Integer> list = new ArrayList<>(hs);
		Collections.sort(list);
		for(int i : list) {
			System.out.print(i + " ");
		}
	}
}