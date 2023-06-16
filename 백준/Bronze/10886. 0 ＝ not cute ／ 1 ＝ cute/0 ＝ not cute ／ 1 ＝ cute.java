import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
        int N = sc.nextInt();
        int cute = 0;
        int Notcute = 0;
        for(int i=0;i<N;i++) {
        	int a = sc.nextInt();
        	if(a==0) {
        		Notcute++;
        	}
        	else {
        		cute++;
        	}
        }
        if(cute>Notcute) {
        	System.out.println("Junhee is cute!");
        }
        else {
        	System.out.println("Junhee is not cute!");
        }
	}
}