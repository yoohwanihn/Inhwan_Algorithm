import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char[] ch = new char[my_string.length()];
        for(int i=0;i<my_string.length();i++){
            ch[i] = my_string.charAt(i);
        }
        Arrays.sort(ch);
        answer = String.valueOf(ch);
        return answer;
    }
}