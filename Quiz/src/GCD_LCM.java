public class GCD_LCM {
    public void main(String[] args){
        int n = 3;
        int m = 12;
        int[] answer = new int[2];
        answer[0] = gcd(n,m);
        answer[1] = lcm(n,m);
    }
    int gcd(int a, int b){
        if(b ==0){
            return a;
        }else {
            return gcd(b, a %b);
        }
    }
    int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
}
