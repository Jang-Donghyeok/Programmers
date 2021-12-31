import java.util.Arrays;

public class LifeBoat {
    public static void main(String[] args){
        int[] people = {70,50,80,50};
        int limit = 100;
        int answer = 0;
        Arrays.sort(people);

        // 몸무게가 적게 나가는 사람 index
        int index = 0;
        for(int i = people.length-1; i>=index; i--){

            // 최대 최소 합이 limit보다 크면 제일 무거운사람 먼저 보냄
            if(people[i] + people[index] > limit){
                answer++;

            }
            // 최대 최소 합이 limit 보다 작거나 같으면 둘다 보냄
            else{
                index++;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
