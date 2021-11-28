import java.util.Collections;

public class MinNumberDelete {
    public static void main(String[] args){
        int[] arr = {4,3,2,1};
        int[] answer =new int[arr.length];
        if(arr.length <= 1) {
            answer = new int[]{-1};
        }
        int min=arr[0];
        for(int i =0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (min == arr[j]) {
                continue;
            } else {
                answer[index++] = arr[j];
            }
        }
    }
}
