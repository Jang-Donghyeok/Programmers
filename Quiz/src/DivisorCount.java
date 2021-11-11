public class DivisorCount {
    public static void main(String[] args){
        int left = 13;
        int right = 17;
        int answer = 0;
        for (int i= left; i<=right; i++){
            if(Divisor(i) % 2 == 0){
                answer += i;
            }else {
                answer -= i;
            }
        }
        System.out.println(answer);

    }
    public static int Divisor(int x){
        int count = 0;
        for(int i =1; i<=x; i++){
           if(x %i == 0){
               count++;
           }
        }
        return count;
    }
}
