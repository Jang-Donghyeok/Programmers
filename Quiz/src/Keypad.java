import java.lang.Math;

public class Keypad {
    public static void main(String[] args){
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        String answer ="";
        int Lpoint = 10;
        int Rpoint = 12;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                answer += "L";
                Lpoint = numbers[i];
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                answer += "R";
                Rpoint = numbers[i];
            }else {
                int Ldistance = length(Lpoint, numbers[i]);
                int Rdistance = length(Rpoint, numbers[i]);
                if(Rdistance == Ldistance){
                    answer += hand.substring(0,1).toUpperCase();
                    if(hand.substring(0,1).equals("r")){
                        Rpoint = numbers[i];
                    }else {
                        Lpoint = numbers[i];
                    }
                }else if(Rdistance < Ldistance){
                    answer += "R";
                    Rpoint = numbers[i];
                }else {
                    answer += "L";
                    Lpoint = numbers[i];
                }
            }
        }
        System.out.println(answer);
    }
    public static int length(int point, int number){
        point = (point==0) ? 11: point;
        number = (number==0) ? 11: number;

        int x = (point-1) / 3;
        int y = (point-1) % 3;
        int numberX = number /3;
        int numberY = 1;

        return Math.abs(x-numberX) + Math.abs(y-numberY);
    }
}
