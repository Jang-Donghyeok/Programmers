import java.util.*;
import java.util.stream.Collectors;

public class FruitSeller {

    public static void main(String[] args) {
        solution(3,4,new int[]{1, 2, 3, 1, 2, 3, 1});
    }
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        HashMap<Integer,Integer> fruit = new HashMap<>();
        for (int j : score) {
            fruit.put(j, fruit.getOrDefault(j, 0) +1);
        }

        while (k > 0){
            if(fruit.getOrDefault(k,0) >= m){
                answer += k * m;
                fruit.put(k, fruit.getOrDefault(k,0) - m);
            } else if (fruit.getOrDefault(k,0) < m && fruit.getOrDefault(k,0) > 0) {
                fruit.put(k-1, fruit.getOrDefault(k,0) +  fruit.getOrDefault(k-1,0) );
                fruit.put(k, fruit.getOrDefault(k,0) - m );
                k--;
            } else {
                k--;
            }
        }
        System.out.println(answer);
        return answer;
    }
    public int solution2(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    }
}
