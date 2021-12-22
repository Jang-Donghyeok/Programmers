public class NextBigNumber {
    public static void main(String[] args){
        int n = 78;
        String bn = Integer.toBinaryString(n);
        int count =0;
        int Bcount =0;
        for(int i=0; i<bn.length(); i++){
            if(bn.substring(i,i+1).equals("1")){
                count++;
            }
        }
        while (count != Bcount){
            Bcount = 0;
            n++;
            bn = Integer.toBinaryString(n);
            for(int i=0; i<bn.length(); i++){
                if(bn.substring(i,i+1).equals("1")){
                    Bcount++;
                }
            }
        }
        System.out.println(bn);
    }
}
/* bitCount활용
    public int solution(int n) {
        int answer = 0;
        int count =Integer.bitCount(n);
        int Bcount =0;
        while (count != Bcount){
            n++;
            Bcount = Integer.bitCount(n);
        }
 */
