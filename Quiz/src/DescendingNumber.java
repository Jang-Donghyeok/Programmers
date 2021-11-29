import java.util.ArrayList;
import java.util.Collections;

public class DescendingNumber {
    public static void main(String[] args){
        long n = 118372;
        String answer = "";
        ArrayList<String> arr = new ArrayList<>();
        String size = String.valueOf(n);
        for(int i =0; i<size.length(); i++){
            arr.add(size.substring(i,i+1));
        }
        Collections.sort(arr);
        for(int i=arr.size()-1; i>=0; i--){
            answer +=  arr.get(i);
        }
        System.out.println(Long.parseLong(answer));
    }
}
