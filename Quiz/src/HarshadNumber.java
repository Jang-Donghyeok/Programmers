public class HarshadNumber {
    public static void main(String[] args){
        int x = 13;
        int sum = 0;
        boolean answer= true;
        String a = String.valueOf(x);
        for(int i=0; i<a.length(); i++){
            sum += Integer.parseInt(a.substring(i,i+1));
        }
        if(x % sum == 0){
            answer = true;
        }else {
            answer = false;
        }
    }
}
