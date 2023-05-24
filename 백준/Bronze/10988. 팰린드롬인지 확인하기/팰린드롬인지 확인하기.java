import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder b = new StringBuilder(a);
        if(a.equals(b.reverse().toString())){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}