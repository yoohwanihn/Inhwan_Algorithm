class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        int[] answer = new int[len];
        if(len%2==1){
            for(int i=0;i<len;i+=2){
                answer[i] = n+arr[i];
            }
            for(int i=1;i<len;i+=2){
                answer[i] = arr[i];
            }
        }
        else{
            for(int i=1;i<len;i+=2){
                answer[i] = n+arr[i];
            }
            for(int i=0;i<len;i+=2){
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}