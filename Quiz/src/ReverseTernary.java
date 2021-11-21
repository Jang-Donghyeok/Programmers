import java.lang.Math;

public class ReverseTernary {
    public static void main(String[] args){
        String number;
        String Ternary = "";
        int n = 125;
        int answer =0;
        while(n > 0){
            number = n%3+"";
            n /= 3;
            Ternary += number;
        }
        number = "";
        for(int i=Ternary.length()-1; i>=0; i--){
            number += Ternary.charAt(i);
        }
        int i;
        for(i=0; i<number.length(); i++){
            answer += ((int)number.charAt(i)-48)*(int)Math.pow(3,i);
        }
        System.out.println(answer);
        /*
        String a = "";

        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();


        return Integer.parseInt(a,3);
         */

    }
}
