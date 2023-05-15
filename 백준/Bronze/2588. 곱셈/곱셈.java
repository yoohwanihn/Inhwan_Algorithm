import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
  
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int count = 1;
        
        sc.close();
    
        while(b!=0){
            System.out.println(a*(b%10));
            sum = sum + a*(b%10)*count;
            b = b/10;
            count = count*10;
        }
        System.out.println(sum);
    }
}