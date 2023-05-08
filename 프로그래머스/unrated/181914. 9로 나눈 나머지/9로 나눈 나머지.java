class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        char[] ch = number.toCharArray();
        for(int i=0;i<ch.length;i++){
            sum += Character.getNumericValue(ch[i]);
        }
        answer = sum%9;
        return answer;
    }
}