import java.util.ArrayList;
import java.util.List;

public class ThreeMusketeers {
    public static void main(String[] args) {
        solution(new int[]{-1, 1, -1, 1});
    }
    public static int solution(int[] number) {
        int answer = 0;
        for(int i=0; i< number.length-2; i++){
            for(int j=i+1; j<number.length-1; j++){
                for(int k=j+1; k<number.length; k++){
                    if(number[i] + number[j] +number[k] == 0){
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}
