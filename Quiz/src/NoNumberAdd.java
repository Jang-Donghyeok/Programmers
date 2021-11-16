public class NoNumberAdd {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,6,7,8,0};
        int answer = 45;
        boolean check;
        int[] number = {0,1,2,3,4,5,6,7,8,9};
        for (int i=0; i<numbers.length; i++){
            check = false;
            for(int j=0; j<10; j++){
                if(numbers[i] !=number[j]){
                    check = true;
                    continue;
                }
                if(check){
                    answer -= numbers[i];
                }
            }
        }
        System.out.print(answer);

    }
}
