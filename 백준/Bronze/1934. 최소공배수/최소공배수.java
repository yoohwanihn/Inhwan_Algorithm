import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter = sc.nextInt();
        for(int i=1;i<=iter;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int maxdiv = 1;            
            for(int j=2;j<=a;j++){
                if(a%j==0 && b%j==0){
                        maxdiv = j;
                }
            }
            System.out.println(a*b/maxdiv);
        }
    }
}