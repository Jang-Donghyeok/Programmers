import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PersonalnformationCollectionValidityPeriod {
    public static void main(String[] args) throws ParseException {
        solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});
    }
    public static int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        int[] answer = {};
        Map<String, Integer> len = new HashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDateTime t = LocalDateTime.parse(today, formatter);
        for(String s: terms){
            len.put(s.split(" ")[0], Integer.valueOf(s.split(" ")[1]));
        }
        for (int i=0; i< privacies.length; i++){
            String date = privacies[i].split(" ")[0];
            String type = privacies[i].split(" ")[1];

            if(Duration.between(t , LocalDateTime.parse(date, formatter).plusMonths(len.get(type))).isNegative()){
                System.out.println(i);
            }
        }
        return answer;
    }
}
