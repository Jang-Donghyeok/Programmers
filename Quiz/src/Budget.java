import java.util.ArrayList;
import java.util.Collections;

public class Budget {
    public static void main(String[] args) {
        int answer = 0;
        int budget = 9;
        int sum = 0;
        int[] d = {1, 3, 2, 5, 4};
        ArrayList<Integer> add = new ArrayList<>();
        for (int i = 0; i < d.length; i++) {
            add.add(d[i]);
        }
        Collections.sort(add);
        if (sum <= budget){
            answer = d.length;
        }
        sum = 0;
        if(sum > budget){
            answer = 0;
        }else if(sum == budget){
            answer = 1;
        }else {
            while(sum < budget){
                sum += add.get(answer);
                if(sum > budget){
                    continue;
                }else{
                    answer++;
                }
            }
        }
        System.out.print(answer);
    }
}
