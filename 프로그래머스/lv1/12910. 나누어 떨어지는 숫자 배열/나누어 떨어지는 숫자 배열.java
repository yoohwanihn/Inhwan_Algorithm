import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer; 
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(i%divisor==0){
                list.add(i);
            }
        }
        list.sort(Comparator.reverseOrder());
        answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(answer.length-1-i).intValue();
        }
        if(list.size()==0){
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}