public class FindKim {
    public static void main(String[] args){
        String[] seoul={"Jane","Kim"};
        String answer = "김서방은 " ;
        for (int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer += String.valueOf(i) + "에 있다";
            }
        }
        System.out.println(answer);
    }
}
