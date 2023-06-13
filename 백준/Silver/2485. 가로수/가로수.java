import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		
		//각 간격간의 최대공약수를 구하기
		int gap = gcd(list.get(1)-list.get(0),list.get(2)-list.get(1));
		for(int i=2;i<list.size()-1;i++) {
			gap = gcd(gap,list.get(i+1)-list.get(i));
			//최대공약수가 1이면 더 볼 필요없이 탈출
			if(gap==1) {
				break;
			}
		}
		
		//결과 출력
		int add = 0;
		for(int i=0;i<list.size()-1;i++) {
			add += (list.get(i+1) - list.get(i))/gap - 1;
		}
		System.out.print(add);
	}
	//유클리드호제법 최대공약수
	public static int gcd(int a, int b) {
		while(b!=0) {
			int temp = a;
			a = b;
			b = temp%b;
		}
		return a;
	}
}