public class HidePhoneNumber {
    public static void main(String[] args){
        String phone_number = "01033334444";
        String answer = "";
        for(int i=0; i<phone_number.length()-4; i++){
            answer += "*";
        }
        answer += new StringBuilder(phone_number).substring(phone_number.length()-4);
        System.out.println(answer);
    }
}
