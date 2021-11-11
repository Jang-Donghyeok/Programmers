import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class KstNumber {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 2, 6, 3, 7, 4};
        ArrayList<Integer> array2 = new ArrayList();
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[command.length];
        int i,j,k;
        for (int x=0; x<command.length; x++) {
            i = command[x][0] - 1;
            j = command[x][1] - 1;
            k = command[x][2] - 1;
            for(int y=i; y<=j; y++){
                array2.add(array1[y]);
            }
            Collections.sort(array2);
            answer[x] += array2.get(k);
            array2.clear();
        }
        System.out.println(answer);
    }
}
