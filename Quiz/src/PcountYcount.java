import java.util.Locale;

public class PcountYcount {
    public static void main(String[] args){
        String s = "Pyy";
        boolean answer = true;
        int pcount=0,ycount =0;
        s = s.toLowerCase();
        for (int i=0; i<s.length(); i++){
            if(s.substring(i,i+1).equals("p")){
                pcount++;
            }
            if(s.substring(i,i+1).equals("y")){
                ycount++;
            }
        }
        if(ycount != pcount){
            answer = false;
        }
        System.out.println(answer);
    }
}
