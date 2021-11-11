import java.util.ArrayList;

public class PhoneKetmon {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> A = new ArrayList();
        for (int i =0; i<nums.length; i++){
            if(!A.contains(nums[i])) {
                A.add(nums[i]);
            }
        }
        if (A.size() > nums.length/2){
            answer = nums.length/2;
        }
        else{
            answer = A.size();
        }
        return answer;
    }
}
