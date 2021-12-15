import java.util.ArrayList;

public class JadenCaseString {
    public static void main(String[] args){
        String s = "3people unFollowed me";
        ArrayList<String> arr = new ArrayList<>();
        String[] Arr;
        Arr = s.split(" ");
        String answer="";
        for(String i:Arr){
            arr.add(i);
        }
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.get(i).length(); j++){
                if (j==0){
                    if((int)arr.get(i).charAt(j)>=48 && (int) arr.get(i).charAt(j)<=57){
                        answer += arr.get(i).charAt(j);
                    }else {
                        answer += arr.get(i).substring(j,j+1).toUpperCase();
                    }
                }else {
                    answer += arr.get(i).substring(j,j+1).toLowerCase();
                }
            }
            if(i < arr.size()-1){
                answer += " ";
            }
        }
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            answer += " ";
        }
        System.out.println(answer);
    }
}
/*
 public String solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
  }
 */
