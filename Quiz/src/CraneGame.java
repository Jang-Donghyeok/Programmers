import java.util.Stack;

public class CraneGame {
    public static void main(String[] args){
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        int check=0;
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<moves.length; i++){
            for(int j=0; j<board.length; j++){
                if (board[j][moves[i]-1] !=0){
                    if(!stack.empty()){
                        check = stack.pop();
                        if(check == board[j][moves[i]-1]){
                            answer +=2;
                        }else {
                            stack.add(check);
                            stack.push(board[j][moves[i]-1]);
                        }
                    }else {
                        stack.push(board[j][moves[i]-1]);
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
