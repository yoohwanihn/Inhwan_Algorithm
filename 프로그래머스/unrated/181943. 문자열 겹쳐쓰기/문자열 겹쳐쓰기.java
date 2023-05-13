class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0,s);
        answer = answer + overwrite_string;
        if(my_string.length() > overwrite_string.length() + s){
            answer += my_string.substring(overwrite_string.length()+s,my_string.length());
        }
        return answer;
    }
}