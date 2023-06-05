import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<5;i++) {
			list.add(sc.nextInt());
			sum+=list.get(i);
		}
		sc.close();
		Collections.sort(list);
		System.out.println(sum/5);
		System.out.println(list.get(5/2));
	}
}