class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for(int i=mode;i<code.length();i++){
            if(code.charAt(i)=='1'){
                if(mode==0){
                    mode = 1;
                    continue;
                }
                else{
                    mode = 0;
                    continue;
                }
            }
            if(i%2==mode){
                answer+=code.charAt(i);
            }
        }
        if(answer.length()==0){
            answer+="EMPTY";
        }
        return answer;
    }
}