import java.util.ArrayList;

public class Budget {
    public static void main(String[] args){
        int answer = 0;
        int sum =0;
        int budget=9;
        int[] d= {1,3,2,5,4};
        ArrayList<Integer> add = new ArrayList<>();
        for (int i=0; i<d.length; i++){
            add.add(d[i]);
        }
        while(sum < budget){
            if(sum >= answer){
                continue;
            }
            else {
                sum += add.get(answer);
            }

        }
    }
}
