package practice;
/* 탐욕법 - 체육복 (https://school.programmers.co.kr/learn/courses/30/lessons/42862)
* */
public class GreedyGymClothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int cnt = 0;
        for(int i = 0; i< lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j]){
                    cnt++;
                    reserve[j] = -2;
                    lost[i] = -100;
                }
            }
        }
        answer = n - lost.length + cnt;
        for(int i = 0; i< lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if((reserve[j]+1)==lost[i] ||(reserve[j]-1)==lost[i]){
                    reserve[j]= -1;
                    lost[i] = -1;
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
