import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

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

/*
다른 풀이
public class KstNumber{
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1] - 1);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }
        return answer;
    }
}*/
