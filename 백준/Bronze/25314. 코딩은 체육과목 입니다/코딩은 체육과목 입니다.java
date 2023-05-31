import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        sc.close();
        String str = "";
        while(b!=0){
            str+="long ";
            b -= 4;
        }
        str+="int";
        System.out.println(str);
    }
}