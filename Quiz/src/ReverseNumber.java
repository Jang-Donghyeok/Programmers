public class ReverseNumber {
    public static void main(String[] args){
        long n = 12345;
        String num = String.valueOf(n);
        int[] answer = new int[num.length()];
        for(int i=num.length(); i>0; i--){
            answer[5-i] = Integer.parseInt(num.substring(i-1,i));
        }
        for (int i : answer){
            System.out.println(i);
        }
    }
}
