public class LeastRectangle {
    public static void main(String[] args){
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        int big;
        int answer=0;
        int wMax=0,hMax=0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] <= sizes[i][1]){
                big = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = big;
            }
        }
        for (int i=0; i<sizes.length; i++){
            for(int j=0; j<sizes[i].length; j++){
                if(j % 2 ==0){
                    if(sizes[i][j] >= wMax){
                        wMax = sizes[i][j];
                    }
                }else {
                    if(sizes[i][j] >= hMax){
                        hMax = sizes[i][j];
                    }
                }
            }
        }
        answer = wMax * hMax;
        System.out.println(answer);
    }
}
