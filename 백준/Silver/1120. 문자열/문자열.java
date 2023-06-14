import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
        String s1 = sc.next();
        String s2 = sc.next();
        int differ = s2.length()-s1.length();
        int count = s1.length();
        
        //길이가 같으면 바로 비교한다.
        if(differ==0) {
        	for(int i=0;i<s2.length();i++) {
        		if(s1.charAt(i)==s2.charAt(i)) {
        			count--;
        		}       	
        	}
    		System.out.print(count); 
        }
        
        //길이가 다르면 길이의 차이 + 1회 만큼 비교하면 된다.
        else {
        	int[] result = new int[differ+1];
        	int min = Integer.MAX_VALUE;
        	for(int i=0;i<result.length;i++) {
        		count = s1.length();
        		for(int j=0;j<s1.length();j++) {
        			if(s1.charAt(j)==s2.charAt(j+i)) {
        				count--;
        			}
        		}
        		result[i] = count;
        	}
        	for(int i=0;i<result.length;i++) {
        		if(result[i]<min) {
        			min = result[i];
        		}
        	}
        	System.out.print(min);
        }
	}
}