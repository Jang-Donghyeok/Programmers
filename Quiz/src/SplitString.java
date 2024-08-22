public class SplitString {
    public static void main(String[] args) {
        solution("aaabbaccccabba");
    }
    public static int solution(String s) {
        int answer = 1;
        char c = s.charAt(0);
        int count =1;
        for(int i=1; i<s.length(); i++){
            if(c != s.charAt(i) && count != 0){
                count--;
            } else if (count==0) {
                c = s.charAt(i);
                count++;
                answer++;
            } else{
                count++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
