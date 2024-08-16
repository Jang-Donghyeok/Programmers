import java.util.ArrayList;
import java.util.List;

public class MakingHamburgers {
    public static void main(String[] args) {
        solution(new int[]{1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1});
    }
    public static int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> rail = new ArrayList<>();
        for (Integer i : ingredient){
            rail.add(i);
            while(rail.size() >= 4) {
                int n = rail.size();
                if(!(rail.get(n-1) == 1
                        && rail.get(n-2)==3
                        && rail.get(n-3) ==2
                        && rail.get(n-4)==1)) break;
                for(int j=0; j<4; j++) {
                    rail.remove(rail.size() -1);
                }
                answer++;
            }
        }

        System.out.println(answer);
        return answer;
    }
}
