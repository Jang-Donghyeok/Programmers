import java.lang.Math;

public class SquareRoot {
    public static void main(String[] args){
        long n = 121;
        long answer = 0;
        double num1 = Math.sqrt(n);
        n = (long) Math.sqrt(n);
        if(num1 - n == 0){
            answer = (long)Math.pow(num1+1,2);
        }else {
            answer = -1;
        }
        System.out.println(answer);
    }
    /*
    if(Math.pow((int)Math.sqrt(n),2) == n){
        return (long) Math.pow(Math.sqrt(n)+1,2);
     }
     return -1
     */
}
