import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
        int T = sc.nextInt();
        
        for(int i=0;i<T;i++) {
        	int a = sc.nextInt();
            int b = sc.nextInt();
            int result = 1;
            
            for(int j=0;j<b;j++) {
            	result = (result*a)%10;
            }
            if(result!=0) {
            System.out.println(result);
            }
            else {
            	System.out.println(10);
            }
        }
	}
}