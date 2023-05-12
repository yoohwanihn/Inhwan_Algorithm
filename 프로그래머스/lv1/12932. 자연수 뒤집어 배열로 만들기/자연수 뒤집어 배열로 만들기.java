import java.util.ArrayList;
class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n!=0){
            list.add((int)(n%10));
            n=n/10;
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}