public class MaxAndMin {
    public static void main(String[] args){
        String s = "1 2 3 4";
        String answer ="";
        String[] arr = s.split(" ");
        int max=Integer.parseInt(arr[0]);
        int min=Integer.parseInt(arr[0]);
        for(int i=0; i<arr.length; i++){
            if(Integer.parseInt(arr[i]) > max){
                max = Integer.parseInt(arr[i]);
            }
            if(Integer.parseInt(arr[i]) < min){
                min = Integer.parseInt(arr[i]);
            }
        }
        answer += String.valueOf(min) + " " + String.valueOf(max);
        System.out.println(answer);
    }
}
