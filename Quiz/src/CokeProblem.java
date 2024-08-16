public class CokeProblem {
    public static void main(String[] args) {
        solution(3,1,20);
    }
    public static int solution(int a, int b, int n) {
        int answer = 0;
        int sum = n;
        int plus = 0;
        while (sum >= a){
            plus = sum / a;
            sum = sum - plus*a +plus*b;
            answer += plus*b;
        }
        System.out.println(answer);
        return answer;
    }
}
