import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fac(a));
    }
    public static int fac(int n){
        if(n<=1) return 1;
        return n*fac(n-1);
    }
}