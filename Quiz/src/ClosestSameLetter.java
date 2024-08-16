import java.util.Arrays;
import java.util.HashMap;

public class ClosestSameLetter {
    public static void main(String[] args) {
        solution("helphelp");
    }
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> check = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            char letter = s.charAt(i);
            answer[i] = i-check.getOrDefault(letter,i+1);
            check.put(letter, i);

        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
