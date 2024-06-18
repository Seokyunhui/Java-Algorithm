package practice;
/* 오픈채팅방 https://school.programmers.co.kr/learn/courses/30/lessons/42888
* */
import java.util.*;
public class OpenChatRoom {
    public String[] solution(String[] record) {
        String[] answer = {};
        Map<String, String> idNickName = new HashMap<>();
        List<String> answerList = new ArrayList<>();

        for(int i = 0 ; i < record.length; i++){
            String[] strArr = record[i].split(" ");

            if(strArr[0].equals("Enter")) {
                answerList.add(String.format("%s님이 들어왔습니다.", strArr[1]));
            }else if(strArr[0].equals("Leave")) {
                answerList.add(String.format("%s님이 나갔습니다.", strArr[1]));
                continue;
            }
            idNickName.put(strArr[1],strArr[2]);
        }
        answer = new String[answerList.size()];

        for(int i = 0 ; i < answerList.size(); i++){
            StringBuilder sb = new StringBuilder(answerList.get(i));

            answer[i] = sb.replace(0,sb.indexOf("님"), idNickName.get(sb.substring(0, sb.indexOf("님")))).toString();
        }

        return answer;
    }
}
