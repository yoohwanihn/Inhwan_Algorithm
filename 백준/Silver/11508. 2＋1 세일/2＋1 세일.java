import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<N;i++) {
			list.add(sc.nextInt());
		}
		sc.close();
		Collections.sort(list,Collections.reverseOrder());
		// i+2를 하는 이유는 remove 하면서 size가 줄어들고 인덱스도 1 줄어듬.
		for(int i=2;i<list.size();i=i+2) {
			list.remove(i);
		}
		for(int i=0;i<list.size();i++) {
			sum += list.get(i).intValue();
		}
		System.out.println(sum);
	}
}