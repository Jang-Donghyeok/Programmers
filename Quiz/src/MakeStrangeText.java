import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class MakeStrangeText {
    public static void main(String[] args){
        String s = "try hello world";
        String[] s1 = {};
        String answer = "";
        s1 = s.split(" ",-1);
        for(int i=0; i<s1.length; i++){
            for(int j=0; j<s1[i].length(); j++){
                if(j % 2==0){
                    answer += s1[i].substring(j,j+1).toUpperCase();
                }else {
                    answer += s1[i].substring(j,j+1).toLowerCase();
                }
            }
            if(i == s1.length-1){
                continue;
            }else {
                answer += " ";
            }
        }
        System.out.println(answer);
    }
}
