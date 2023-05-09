class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int count = 0;
        int a = my_string.length();
        int b = is_prefix.length();
        if(a>=b){
          for(int i=0;i<b;i++){
              if(my_string.charAt(i)==is_prefix.charAt(i)){
                  count++;
              }
          }
        }
        return b==count? ++answer : answer;
    }
}