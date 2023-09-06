import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] Croatia_alphabet = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0;i<Croatia_alphabet.length;i++) {
			input = input.replace(Croatia_alphabet[i], "!");
		}
		System.out.println(input.length());
	}
}