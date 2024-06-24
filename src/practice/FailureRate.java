package practice;

import java.util.*;

public class FailureRate {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] clear = new int[N + 1];
        int player = stages.length;
        Map<Integer, Double> stageFailPer = new HashMap<>();

        // 스테이지에 도달한 사람 수
        for(int i = 0 ; i < stages.length ; i++){
            int num = stages[i];
            clear[num - 1] += 1;
        }



        //스테이지 별 실패율
        for(int i = 1; i <= N; i++){
            double per = clear[i-1] == 0? 0 : (double)clear[i -1] / player;
            stageFailPer.put(i ,per);
            player -= clear[i-1];
        }
        int i = 0;
        /*for(int stageNum : stageFailPer.keySet()){
            System.out.println("stage " + stageNum + ": " + clear[i++] +"->" +  stageFailPer.get(stageNum));
        }*/
        // 실패율에 따른 Sort
        List<Integer> keyList = new ArrayList<>(stageFailPer.keySet());
        Collections.sort(keyList, (o1, o2) -> (stageFailPer.get(o2).compareTo(stageFailPer.get(o1))));

        for(int k : keyList)
            answer[i++] = k;
        return answer;
    }
}
