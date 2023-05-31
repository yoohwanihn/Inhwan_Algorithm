import java.util.ArrayList;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        ArrayList<Integer> list  = new ArrayList<>();
        if(direction.equals("left")){
            for(int i=1;i<numbers.length;i++){
                list.add(numbers[i]);
            }
            list.add(numbers[0]);
        }
        else{
            list.add(numbers[numbers.length-1]);
            for(int i=0;i<numbers.length-1;i++){
                list.add(numbers[i]);
            }
        }
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}