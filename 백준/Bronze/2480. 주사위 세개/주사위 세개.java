import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0;i<3;i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);
        if(a[0]==a[1] && a[1]==a[2]){
            System.out.println(10000+1000*a[0]);
        }
        else if(a[0]==a[1]){
            System.out.println(1000+100*a[0]);
        }
        else if(a[0]==a[2]){
            System.out.println(1000+100*a[0]);
        }
        else if(a[1]==a[2]){
            System.out.println(1000+100*a[2]);
        }
        else{
            System.out.println(a[2]*100);
        }
    }
}