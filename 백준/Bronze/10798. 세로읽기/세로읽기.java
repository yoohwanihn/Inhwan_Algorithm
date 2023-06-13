import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//최대 15글자
		char[][] rc = new char[5][15];
		int max = -1;
		
		//String 생성후 char 행렬에 입력, 가장 긴 행 길이 저장
		for(int i=0;i<rc.length;i++) {
			String str = sc.nextLine();
			for(int j=0;j<str.length();j++) {
				rc[i][j] = str.charAt(j);
			}
			if(str.length()>max) {
				max = str.length();
			}
		}
		
		for(int i=0;i<max;i++) {
			for(int j=0;j<rc.length;j++) {
				if(rc[j][i]=='\0') continue;
				System.out.print(rc[j][i]);
			}
		}
		
	}
}