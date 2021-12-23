public class LottoHighestRankingAndWorstRanking {
    public static void main(String[] args){
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] answer = new int[2];
        int count = 0;
        int same = 0;
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                count++;
            }
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    same++;
                }
            }
        }
        if(count+same == 6){
            answer[0] = 1;
        }else if(count+same == 5){
            answer[0] = 2;
        }else if(count+same == 4){
            answer[0] = 3;
        }else if(count+same == 3){
            answer[0] = 4;
        }else if(count+same == 2){
            answer[0] = 5;
        }else {
            answer[0] = 6;
        }
        if(same == 6){
            answer[1] = 1;
        }else if(same == 5){
            answer[1] = 2;
        }else if(same == 4){
            answer[1] = 3;
        }else if(same == 3){
            answer[1] = 4;
        }else if(same == 2){
            answer[1] = 5;
        }else {
            answer[1] = 6;
        }
    }
}
