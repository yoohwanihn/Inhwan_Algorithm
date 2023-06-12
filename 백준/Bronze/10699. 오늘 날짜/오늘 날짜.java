import java.util.Date;
import java.text.SimpleDateFormat;

public class Main{
	public static void main(String[] args){
		Date d = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print(df.format(d));
	}
}