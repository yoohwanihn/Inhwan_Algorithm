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
        answer += my_string.substring(e+1);
        return answer;
    }
}