import java.util.Arrays;

public class MockExam {
    public static void main(String[] args){
        int[][] player = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        int[] player1 = new int[10000];
        int[] player2 = new int[10000];
        int[] player3 = new int[10000];
        for(int i =0; i<10000; i++){
            player1[i] = player[0][i%5];
            player2[i] = player[1][i%8];
            player3[i] = player[2][i%10];
        }
        int[] answers = {1,3,2,4,2};
        int player1count = 0,player2count = 0,player3count = 0;
        for(int i=0; i<answers.length; i++){
            if(player1[i] == answers[i]){
                player1count++;
            }
            if(player2[i] == answers[i]){
                player2count++;
            }
            if(player3[i] == answers[i]){
                player3count++;
            }
        }
        int[] answer;
        if(player1count == player2count && player2count == player3count){
            answer = new int[3];
            answer[0] = 1;
            answer[1] = 2;
            answer[2] = 3;
        }else if (((player1count>player3count)&&(player1count == player2count && player2count != player3count))||
                ((player1count>player2count)&&(player1count == player3count && player2count != player3count))||
                ((player3count>player1count)&&(player2count == player3count && player2count != player1count))){
            answer = new int[2];
        }else {
            answer = new int[1];
        }
        if(answer.length == 2){
            if(player1count<player2count && player1count<player3count){
                answer[0] = 2;
                answer[1] = 3;
            }
            if(player2count<player1count && player2count<player3count){
                answer[0] = 1;
                answer[1] = 3;
            }
            if(player3count<player1count && player3count<player2count){
                answer[0] = 1;
                answer[1] = 2;
            }
        }
        else if(answer.length == 1){
            if(player1count>=player2count && player1count>=player3count){
                answer[0] = 1;
            }else if(player2count>=player1count && player2count>=player3count){
                answer[0] = 2;
            }else{
                answer[0] = 3;
            }
        }




    }
}
