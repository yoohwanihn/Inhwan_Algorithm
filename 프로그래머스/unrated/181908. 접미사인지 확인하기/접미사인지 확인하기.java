class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if(is_suffix.length()>my_string.length()) return answer;
        if(my_string.substring(my_string.length()-is_suffix.length()).equals(is_suffix)) answer = 1;
        
        return answer;
    }
}