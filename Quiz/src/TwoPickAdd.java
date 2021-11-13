import java.util.ArrayList;
import java.util.Arrays;


public class TwoPickAdd {
    public static void main(String[] args) {
        int[] number = {2, 1, 3, 4, 1};
        ArrayList<Integer> result = new ArrayList();
        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                int sum = number[i] + number[j];
                if(result.indexOf(sum) <0){
                    result.add(sum);
                }
            }
        }
        System.out.print(result);
        int[] answer = new int[result.size()];
        for (int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        Arrays.sort(answer);
    }
}
