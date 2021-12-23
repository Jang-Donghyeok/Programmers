public class CorrectParenthesis {
    public static void main(String[] args){
        String s = "()()";
        boolean answer = false;
        int check =0;
        for(int i=0; i<s.length(); i++){
            if(s.substring(i,i+1).equals("(")){
                check++;
            }
            if(s.substring(i,i+1).equals(")")){
                check--;
            }
            if(check < 0){
                break;
            }
        }
        if(check ==0){
            answer = true;
        }
        System.out.println(answer);
    }
}
