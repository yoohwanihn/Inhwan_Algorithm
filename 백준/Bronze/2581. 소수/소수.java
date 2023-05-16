import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(;a<=b;a++){
        	int i=2;
        	for(;i<a;i++) {
            	if(a%i==0) {
            		break;
            	}
            }
            if(a==i) {
            	sum=sum+i;
            	if(a<min) {
                	min=a;
                }
            }
        }
        if(sum!=0){
            System.out.println(sum);
            System.out.println(min);
        }
        else{
            System.out.println(-1);
        }
    
    }
}