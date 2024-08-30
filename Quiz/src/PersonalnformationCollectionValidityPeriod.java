import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonalnformationCollectionValidityPeriod {
    public static void main(String[] args) throws ParseException {
        solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});
    }
    public static int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> len = new HashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate t = LocalDate.parse(today, formatter);
        for(String s: terms){
            len.put(s.split(" ")[0], Integer.valueOf(s.split(" ")[1]));
        }
        for (int i=0; i< privacies.length; i++){
            String date = privacies[i].split(" ")[0];
            String type = privacies[i].split(" ")[1];

            if(t.isAfter(LocalDate.parse(date,formatter).plusMonths(len.get(type)).minusDays(1))){
                answer.add(i+1);
            }
        }
        System.out.println(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
