class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        for(int i=0;i<num_list.length;i++){
            for(int j=i;j<num_list.length;j++){
                if(num_list[i]>num_list[j]){
                    int swap=0;
                    swap=num_list[j];
                    num_list[j]=num_list[i];
                    num_list[i]=swap;
                }
            }
        }
        for(int i=0;i<answer.length;i++)
            answer[i] = num_list[i];
        return answer;
    }
}