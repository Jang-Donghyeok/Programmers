import java.util.*;

public class GetReportResults {
    public static void main(String[] args) {
        solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2);
    }
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, List<String>> reportUsers = new HashMap<>();
        Map<String, Integer> reportedUsers = new HashMap<>();
        for (String s : id_list) {
            reportUsers.put(s, new ArrayList<>());
        }
        for (String s : report) {
            String reportUser = s.split(" ")[0];
            String reportedUser = s.split(" ")[1];
            if(reportUsers.get(reportUser).contains(reportedUser)) continue;
            reportUsers.get(reportUser).add(reportedUser);
            reportedUsers.put(reportedUser, reportedUsers.getOrDefault(reportedUser,0)+1);
        }
        for (int i=0; i<id_list.length; i++) {
            for(int j=0; j<reportUsers.get(id_list[i]).size(); j++){
                if(reportedUsers.get(reportUsers.get(id_list[i]).get(j)) >= k){
                    answer[i]++;
                }
            }

        }
        System.out.println(reportUsers);
        System.out.println(reportedUsers);
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
