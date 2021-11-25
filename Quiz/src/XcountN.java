public class XcountN {
    public static void main(String[] args){
        long x = 2;
        int n = 5;
        long[] answer = new long[n];
        for(int i=0; i<n; i++){
            answer[i] += x*(i+1);
        }
    }
}
