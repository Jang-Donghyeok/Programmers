import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonalityTypeTest {
    public static void main(String[] args) {
        solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});
    }
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> personal = new HashMap<>();
        Map<Integer, List<String>> kind = new HashMap<>();
        List<String> personalType = List.of(new String[]{"R", "T", "C", "F", "J", "M", "A", "N"});
        for(int i=0; i<personalType.size(); i++){
            if(i % 2 ==0){
                kind.put((i /2)+1, personalType.subList(i, i+2));
            }
            personal.put(personalType.get(i), 0);
        }
        for(int i=0; i< choices.length; i++){
            if(choices[i] >4) {
                personal.put(survey[i].substring(0, 1), personal.get(survey[i].substring(0, 1)));
                personal.put(survey[i].substring(1, 2), personal.get(survey[i].substring(1, 2)) + Math.abs(4 - choices[i]));
            }else {
                personal.put(survey[i].substring(0,1),  personal.get(survey[i].substring(0,1)) +Math.abs(4-choices[i]));
                personal.put(survey[i].substring(1,2),  personal.get(survey[i].substring(1,2)));
            }
        }
        for(int i=1; i<= kind.size(); i++){
            answer += personal.get(kind.get(i).get(0)) >= personal.get(kind.get(i).get(1)) ? kind.get(i).get(0) : kind.get(i).get(1);
        }
        System.out.println(answer);
        return answer;
    }
}
