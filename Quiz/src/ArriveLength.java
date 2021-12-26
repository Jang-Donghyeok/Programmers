public class ArriveLength {
    public static void main(String[] args){
        String dirs = "ULURRDLLU";
        int answer = 0;
        int[] dx = {0,0,1,-1};
        int[] dy = {-1,1,0,0};
        boolean[][][][] visit = new boolean[11][11][11][11];
        int x = 0;
        int y = 0;
        int nextX = 5;
        int nextY  = 5;
        int index = 0;
        for(int i=0; i<dirs.length(); i++){
            x = nextX;
            y = nextY;
            if(dirs.substring(i,i+1).equals("U")){
                index = 0;
            }else if(dirs.substring(i,i+1).equals("D")){
                index = 1;
            }else if(dirs.substring(i,i+1).equals("R")){
                index = 2;
            }else if(dirs.substring(i,i+1).equals("L")){
                index = 3;
            }

            nextX += dx[index];
            nextY += dy[index];

            if(nextX < 0 || nextY <0 || nextX >10 || nextY >10){
                nextX -= dx[index];
                nextY -= dy[index];
                continue;
            }
            if(!visit[x][y][nextX][nextY] && !visit[nextX][nextY][x][y]){
                visit[x][y][nextX][nextY] = true;
                visit[nextX][nextY][x][y] = true;
                answer++;
            }
        }
    }
}
