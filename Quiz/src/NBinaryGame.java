public class NBinaryGame {
    public static void main(String[] args){
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 1;
        String game = "";
        String answer ="";
        int index = p-1;
        for(int i=0; i<t*m; i++){
            game += Integer.toString(i, n).toUpperCase();
            }
        for(int i=0; i<t; i++){
            answer += game.substring(index,index+1);
            index += m;
        }
        System.out.println(answer);
    }
}
