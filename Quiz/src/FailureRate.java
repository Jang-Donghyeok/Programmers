import java.util.*;

public class FailureRate {
    public static void main(String[] args){
        int[] stage = {2,1,2,6,2,4,3,3};
        solution(5, stage);
    }
    public static int[] solution(int N, int[] stages){
        int[] answer = new int[N];
        double[] fail = new double[N];
        double[] after = new double[N];
        List<Integer> test = new ArrayList<>();
        int[] trial = new int[N];
        for(int i=0; i<N; i++){
            for(int j=0; j<stages.length; j++){
                if(stages[j] == i+1){
                    fail[i]++;
                }
                if(stages[j] >= i+1){
                    trial[i]++;
                }
            }
        }
        for(int k=0; k<N; k++){
            if(trial[k] == 0){
                fail[k] = 0;
                break;
            }
            fail[k] = fail[k] / trial[k];
        }
        after = Arrays.stream(fail).sorted().toArray();

        for (int i=N-1; i>=0; i--){
            for(int j=0; j<N; j++){
                if(after[i] == fail[j]){
                    test.add(j+1);
                    fail[j] =-1;
                    break;
                }
            }
        }
        for(int i=0; i< test.size(); i++){
            answer[i] = test.get(i);
        }
        return answer;
    }
}
