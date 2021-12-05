import java.util.ArrayList;
import java.util.Collections;

public class StringMyself {
    public static void main(String[] args){
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        String[] answer = new String[strings.length];
        ArrayList<String> arr= new ArrayList<>();
        char[] index = new char[strings.length];
        for (int i=0; i<strings.length; i++){
            arr.add(""+strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(arr);
        for (int i=0; i<strings.length; i++){
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
            }

        for (String i:answer){
            System.out.println(i);
        }
    }
}
