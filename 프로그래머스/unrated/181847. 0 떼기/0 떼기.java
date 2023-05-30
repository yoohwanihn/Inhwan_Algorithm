class Solution {
    public String solution(String n_str) {
        String answer = "";
        int idx = -1;
        for(int i=0;i<n_str.length();i++){
            if(n_str.charAt(i)=='0'){
                continue;
            }
            idx=i;
            break;
        }
        answer = n_str.substring(idx);
        return answer;
    }
}