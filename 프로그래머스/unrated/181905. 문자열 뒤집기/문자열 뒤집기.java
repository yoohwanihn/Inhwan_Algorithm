class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=s;i<=e;i++){
            sb.append(my_string.charAt(i));
        }
        for(int i=0;i<s;i++){
            answer += my_string.charAt(i);
        }
        answer += sb.reverse().toString();
        for(int i=e+1;i<my_string.length();i++){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}