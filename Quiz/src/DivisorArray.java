import java.util.Arrays;
import java.util.ArrayList;

public class DivisorArray {
    public static void main(String[] args){
        int[] arr = {3,2,6};
        int divisor = 10;
        ArrayList<Integer> arry = new ArrayList<>();
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                arry.add(arr[i]);
            }
        }
        int[] answer = new int[arry.size()];
        for(int i=0; i<arry.size(); i++){
            answer[i] = arry.get(i);
        }
        if(answer.length ==0){
            answer = new int[]{-1};
        }
    }
}
