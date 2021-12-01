public class StringtoNumber {
    public static void main(String[] args){
        String s = "1234";
        int answer = 0;
        if(s.substring(0,1) =="-"){
            answer -= Integer.parseInt(s.substring(1,s.length()));
        }else {
            answer += Integer.parseInt(s.substring(0,s.length()));
        }
        System.out.println(answer);
    }
}
