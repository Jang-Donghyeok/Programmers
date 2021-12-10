public class Rest1Number {
    public static void main(String[] args){
        int n = 10;
        int answer =0;
        for(int i=2; i<n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }
    }
}
