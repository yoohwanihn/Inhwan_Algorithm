import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        sc.close();
        long sum = 0;
        int n = 0;
        for(int l=1;l<=a;l++){
            if(sum>a-l) break;
            sum+=l;
            n++;
        }
        System.out.println(n);
    }
}