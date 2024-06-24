package practice;

public class Fatigue {
    private boolean[] isClear;
    private int answer = -1;
    public int solution(int k, int[][] dungeons) {
        isClear = new boolean[dungeons.length];

        search(0, k, dungeons);

        return answer;
    }

    private void search(int depth, int k, int[][] dungeons){
        for(int i = 0; i < dungeons.length; i++){
            if(depth >= dungeons.length)
                break;

            isClear[i] = true;
            search(depth + 1, k - dungeons[i][1], dungeons);
            isClear[i] = false;
        }
        answer = Math.max(depth, answer);
    }
}
