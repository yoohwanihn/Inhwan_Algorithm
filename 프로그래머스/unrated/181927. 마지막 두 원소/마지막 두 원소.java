import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list) {
        ArrayList<Integer> num = new ArrayList<>();
        for(int i : num_list){
            num.add(i);
        }
        if(num_list[num_list.length-1]>num_list[num_list.length-2]){
            num.add(num_list[num_list.length-1]-num_list[num_list.length-2]);
        }
        else{
            num.add(2*num_list[num_list.length-1]);
        }
        int[] answer = new int[num.size()];
        for(int i=0;i<num.size();i++){
            answer[i]= num.get(i).intValue();
        }
        return answer;
    }
}