public class NumberSum {
    public static void main(String[] args){
        int a =3, b=5;
        long answer =0;
        int big = a > b ? a: b;
        int small = a > b ? b : a;
        for(int i=small; i<=big; i++){
            answer += i;
        }
    }
}
