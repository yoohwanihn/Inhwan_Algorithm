import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(n);
        for(int i=1;i<1000;i++){
            if(n%2==0){
                n=n/2;
                arr.add(n);
            }
            else {
                n=3*n+1;
                arr.add(n);
            }
            if(n==1)
                break;
        }
        int[] answer = new int[arr.size()];
        for (int i=0;i<arr.size();i++){ 
            answer[i] = arr.get(i).intValue();
        }
        return answer;
    }
}