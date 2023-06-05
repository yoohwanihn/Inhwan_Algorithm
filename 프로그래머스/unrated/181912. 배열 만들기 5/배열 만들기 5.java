import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<intStrs.length;i++){
            intStrs[i] = intStrs[i].substring(s,s+l);
            if(Integer.parseInt(intStrs[i])>k){
                list.add(Integer.parseInt(intStrs[i]));
            }
        }
        answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}