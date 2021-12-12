import java.util.LinkedList;
import java.util.Queue;

public class NLCM {
    public static void main(String[] args){
        int[] arr  ={2,6,8,14};
        int answer=1;
        Queue<Integer> queue = new LinkedList<>();
        for(int i: arr){
            queue.add(i);
        }
        while (!queue.isEmpty()){
            answer = lcm(answer,queue.poll());
        }
        System.out.println(answer);
    }
    static int gcd(int a, int b){
        if(b ==0){
            return a;
        }else {
            return gcd(b, a %b);
        }
    }
    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
