public class FindDecimal {
    public static void main(String[] args){
        int n = 10;
        int result =0;
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                result++;
            }
        }
        System.out.println(result);
    }
    public static boolean isPrime(int n) {
        int end = (int) Math.sqrt(n);
        for (int i = 2; i <= end; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
