class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length+4)/5];
        int idx = 0;
        for(int i=0;i<names.length;i=i+5){
            answer[idx++]=names[i];
        }
        return answer;
    }
}