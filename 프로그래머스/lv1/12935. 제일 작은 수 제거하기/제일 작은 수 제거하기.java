class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length==1){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        else{
            answer = new int[arr.length-1];
            int min = Integer.MAX_VALUE;
            int minidx = -1;
            int idx = 0;
        
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min = arr[i];
                    minidx = i;
                }
            }
            for(int i=0;i<arr.length;i++){
                if(i==minidx){
                    continue;
                }
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}