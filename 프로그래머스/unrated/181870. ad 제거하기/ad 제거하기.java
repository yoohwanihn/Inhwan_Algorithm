class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strArr.length;i++){
            if(!strArr[i].contains("ad")){
                sb.append(strArr[i] + " ");
            }
        }
        answer = sb.toString().split(" ");
        return answer;
    }
}