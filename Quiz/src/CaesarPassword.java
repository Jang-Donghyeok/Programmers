public class CaesarPassword {
    public static void main(String[] args){
        String s = "aBZ";
        int n = 20;
        String answer = "";
        int ascii = 0;
        String[] s1 = s.split("");
        for(int i=0; i<s1.length; i++){
            ascii = (int)s1[i].charAt(0);
            if(ascii == 32){
                answer += " ";
                continue;
            }
            if(ascii>= 65 && ascii<=90){
                ascii += n;
                if(ascii > 90){
                    ascii -= 26;
                }
            }else if(ascii>= 97 && ascii<=122) {
                ascii += n;
                if (ascii > 122) {
                    ascii -= 26;
                }
            }
            answer += (char) ascii;
        }
        System.out.println(answer);
    }
}
