public class ArrayMultiplication {
    public static void main(String[] args){
        int[][] arr1 = {{2,3,2},{4,2,4},{3,1,4}};
        int[][] arr2 = {{5,4},{2,4},{3,1}};
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                for(int index=0; index<arr2.length; index++){
                    answer[i][j] += arr1[i][index]*arr2[index][j];
                }
            }
        }
    }
}
