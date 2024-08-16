import java.util.*;
import java.util.stream.Collectors;

public class HallofFame {
    public static void main(String[] args) {
        solution(3, new int[]{10,100,20,150,1,100,200});
    }
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> frame = new ArrayList<>();
        for (int i =0; i<score.length; i++) {
            frame.add(score[i]);
            frame= frame.stream().sorted(Comparator.reverseOrder()).limit(k).collect(Collectors.toList());
            answer[i] = frame.get(frame.size()-1);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
