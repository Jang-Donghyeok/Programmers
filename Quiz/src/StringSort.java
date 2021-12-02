import java.util.Arrays;

public class StringSort {
    public static void main(String[] args){
        String s="Zbcdefg";
        String answer = "";
        int[] check = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            check[i] = (int) s.charAt(i);
        }
        Arrays.sort(check);
        for(int i=check.length-1; i>=0; i--){
            answer += (char) check[i];
        }

        System.out.println(answer);
    }
}
