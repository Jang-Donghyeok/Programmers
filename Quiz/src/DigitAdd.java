public class DigitAdd {
    public static void main(String[] args){
        int n = 123;
        int answer = 0;
        String size = String.valueOf(n);
        for(int i=0; i<size.length(); i++){
            answer += n % 10;
            n /= 10;
        }
        System.out.println(answer);
    }
}
