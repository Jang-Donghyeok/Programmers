import java.util.Arrays;

public class StringCheck {
    public static void main(String[] args){
        String s = "1234";
        boolean answer = true;
        if(s.length()==4 || s.length()==6){
            for (int i=0; i<s.length(); i++){
                if((int) s.charAt(i)>=48 && (int) s.charAt(i)<=57){
                    answer = true;
                }else {
                    answer = false;
                    break;
                }
            }
        }else {
            answer = false;
        }
        System.out.println(answer);
    }

    /*
    if(s.length() == 4 || s.length() == 6){
          try{
              int x = Integer.parseInt(s);
              return true;
          } catch(NumberFormatException e){
              return false;
          }
      }
      else return false;
     */
}
