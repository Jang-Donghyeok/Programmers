
public class PackOfCards {
	public static void main(String[] args) {
		System.out.println(solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
	}
	public static String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "Yes";
		int i=0;
		int j=0;
		for(String s: goal){
			if(i<cards1.length && cards1[i].equals(s)){
				i++;
			}else if (j< cards2.length && cards2[j].equals(s)){
				j++;
			}else {
				answer = "No";
				return answer;
			}
		}
		return answer;
	}
}
