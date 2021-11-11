import java.util.Scanner;

public class DecimalMake {
    public static void main(String[] args) {
        int[] nums;
        String num;
        String[] sd;
        int sum = 0;
        int result = 0;
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        num = sc.nextLine();
        sd = num.split(",");
        nums =new int[sd.length];
        for (int x=0; x<sd.length; x++) {
            nums[x] = Integer.parseInt(sd[x]);
        }
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    sum = nums[i]+ nums[j]+nums[k];
                    if(isPrime(sum)) {
                        result += 1;
                    }
                }
            }
        }
        System.out.print(result);
    }
    public static boolean isPrime(int num) {
        boolean result = false;
        for(int i = 2; i < num; i++) {
            if( num%i == 0) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}
