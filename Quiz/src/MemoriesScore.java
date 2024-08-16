import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MemoriesScore {
    public static void main(String[] args) {
        solution(new String[]{"may", "kein", "kain", "radi"}, new int[]{5,10,1,3}, new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}});
    }
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> score = new HashMap<>();
        for(int i=0; i<name.length; i++){
            score.put(name[i], yearning[i]);
        }
        for(int i=0; i< photo.length; i++){
            int photo_sum = 0;
            for(int j=0; j<photo[i].length; j++){
                photo_sum += score.getOrDefault(photo[i][j],0);
            }
            answer[i] = photo_sum;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
