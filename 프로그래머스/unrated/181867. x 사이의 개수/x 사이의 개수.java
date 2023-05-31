import java.util.ArrayList;
class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i)!='x'){
                count++;
                continue;
            }
            list.add(count);
            count = 0;
        }
        list.add(count);
        answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}