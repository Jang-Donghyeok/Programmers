public class Fibonacci {
    public static void main(String[] args){
        int n = 3;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            if(i==0){
                arr[i] =0;
            }else if(i == 1){
                arr[i] = 1;
            }else {
                arr[i] = (arr[i-2]%1234567)+(arr[i-1]%1234567);
            }
        }
        int answer=(arr[n-2]+arr[n-1])%1234567;
        System.out.println(answer);
    }
}
