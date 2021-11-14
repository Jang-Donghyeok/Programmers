public class Year2016 {
    public static void main(String[] args){
        int a = 5;
        int b = 24;
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int alldate=0;
        for(int i=0; i<a-1; i++){
            alldate += date[i];
        }
        alldate += b-1;
        System.out.print(day[alldate % 7]);
    }
}
