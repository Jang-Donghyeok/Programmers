public class NumberStringAndEnglishWord {
    public static void main(String[] args){
        String s = "one4seveneight";
        int answer =0;
        String[] arr = {"zero", "one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0; i<arr.length; i++){
            s = s.replaceAll(arr[i], String.valueOf(i));
        }
        answer = Integer.parseInt(s);
        System.out.println(answer);
    }
}
