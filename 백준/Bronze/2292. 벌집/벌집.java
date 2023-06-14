import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        int count = 1;	//범위 갯수(최소값)
        int range = 2;	//해당 범위의 최소값(2~7로 시작해서 2로 초기화)
        
        if(n==1) {
        	System.out.print(count);
        }
        else {
        	while(n>=range) {
        		range += count*6;
        		count++;
        	}
        	System.out.print(count);
        }
	}
}