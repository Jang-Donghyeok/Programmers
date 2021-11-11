public class GymSuit {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int count = 0;
        int steal = 0;
        answer = n;
        answer -= lost.length;
        for(int i =0; i< lost.length; i++){
            for (int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    steal++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int i =0; i<lost.length; i++){
            for (int j =0; j<reserve.length; j++){
                if (lost[i] == reserve[j]+1 || lost[i] == reserve[j]-1){
                    count++;
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
            }
        }
        answer += steal + count;
        return answer;
    }
}