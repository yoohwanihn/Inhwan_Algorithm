import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long input1 = sc.nextLong();
        long input2 = sc.nextLong();
        System.out.println(input1*input2/gcd(input1,input2));
    }
    public static long gcd(long num1, long num2){
        while(num2!=0){
            long tmp = num1;
            num1=num2;
            num2=tmp%num2;
        }
        return num1;
    }
}