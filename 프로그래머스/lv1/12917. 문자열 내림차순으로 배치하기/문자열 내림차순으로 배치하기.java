import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(str);
        for(int i=0;i<str.length;i++){
            sb.append(str[i]);
        }
        answer = sb.reverse().toString();
        return answer;
    }
}