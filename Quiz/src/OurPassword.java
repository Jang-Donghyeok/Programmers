
public class OurPassword {
	public static void main(String[] args) {
		solution( "zzz", "a", 1);
	}
	public static String solution(String s, String skip, int index) {
		StringBuilder answer = new StringBuilder();
		for(char start: s.toCharArray()){
			int count =0;
			while (count < index){
				start++;

				if(start > 'z'){
					start = 'a';
				}
				if(!skip.contains(String.valueOf(start))){
					count++;
				}
			}
			answer.append((char)start);
		}
		System.out.println(answer);
		return answer.toString();
	}
}
