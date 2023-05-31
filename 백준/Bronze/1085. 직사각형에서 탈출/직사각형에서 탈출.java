import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int xd = Math.abs(a-c)>a ? a : Math.abs(a-c);
        int yd = Math.abs(b-d)>b ? b : Math.abs(b-d);
        if(xd>yd){
            System.out.println(yd);
        }
        else{
            System.out.println(xd);
        }
    }
}