import java.util.Arrays;

public class DontFinishAthletes {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = "";
        int i = 0;
        for(i=0; i<participant.length; i++){
            if(!participant[i].equals(completion[i])){
                break;
            }
        }
        answer = participant[i];
        System.out.print(answer);
    }
}
