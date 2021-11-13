import java.util.ArrayList;
import java.util.Collections;


public class TwoPickAdd {
    public static void main(String[] args) {
        int[] number = {2, 1, 3, 4, 1};
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList();
        boolean[] visited = new boolean[number.length];
        comb(number, visited, 0, number.length, 2);
        Collections.sort(result);
    }

    static void comb(int[] arr, boolean[] visited, int depth, int n, int r) {
        if (r == 0) {
            add(arr, visited, n);
            return;
        }
        if (depth == n) {
            return;
        } else {
            visited[depth] = true;
            comb(arr, visited, depth + 1, n, r - 1);

            visited[depth] = false;
            comb(arr, visited, depth + 1, n, r);
        }
    }

    static void add(int[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            int result = 0;
            if (visited[i]) {
                result += arr[i];
                System.out.print(result);
            }
        }
        System.out.println();
    }
}
