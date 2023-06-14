import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
        while(true) {
        	int N = sc.nextInt();
        	//-1을 입력받을때 종료
        	if(N==-1)break;
        	
        	//자신을 제외한 약수의 합 더하기
        	int sum = 0;
        	ArrayList<Integer> div = new ArrayList<>();
        	for(int i=1;i<N;i++) {
        		if(N%i==0) {
        			sum += i;
        			div.add(i);
        		}
        	}
            //완전수O
        	if(sum==N) {
        		System.out.print(sum+ " = ");
        		for(int i=0;i<div.size()-1;i++) {
        			System.out.print(div.get(i) + " + ");
        		}
        		System.out.println(div.get(div.size()-1));
        	}
            //완전수X
        	else {
        		System.out.println(N + " is NOT perfect.");
        	}
        }
	}
}
	