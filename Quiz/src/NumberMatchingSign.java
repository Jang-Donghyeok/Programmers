
public class NumberMatchingSign {
    public static void main(String[] args) {
        solution("5525","1255");
    }
    public static String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] A = new int[10];
        int[] B = new int[10];
        for(int i=0; i<X.length(); i++){
            A[X.charAt(i) - '0']++;
        }
        for(int i=0; i<Y.length(); i++){
            B[Y.charAt(i) - '0']++;
        }
        for(int i=9; i>=0; i--){
            answer.append(String.valueOf(i).repeat(Math.max(0, Math.min(A[i], B[i]))));
        }
        if(answer.length() ==0){
            return "-1";
        }else if(answer.charAt(0) == '0'){
            return "0";
        }
        return answer.toString();
    }

}
