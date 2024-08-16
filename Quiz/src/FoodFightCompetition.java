public class FoodFightCompetition {
    public static void main(String[] args) {
        solution(new int[]{1,7,1,2});
    }
    public static String solution(int[] food) {
        String answer = "";
        StringBuilder builder = new StringBuilder();
        for(int i=1; i<food.length; i++){
            builder.append(String.valueOf(i).repeat(Math.max(0, food[i] / 2)));
        }
        answer = builder + "0";
        System.out.println(answer);
        return answer + builder.reverse();
    }
}
