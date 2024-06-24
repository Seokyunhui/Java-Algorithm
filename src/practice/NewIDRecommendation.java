package practice;

public class NewIDRecommendation {
    public String solution(String new_id) {
        String answer = "";
        String regExp = "[^a-z0-9-_.]"; // a ~ z , 0 ~ 9, '-' , '_', '.' 을 제외한 모든 문자

        answer = new_id.toLowerCase()     //1단계 대문자 -> 소문자
                .replaceAll(regExp,"")  //2단계 -> 특수문자 제거
                .replaceAll("[.]{2,}", ".")  //3단계 마침표가 연속 될 경우 한개만
                .replaceAll("^[.]", "") ;      //4단계 마침표가 제일 앞에 올 경우 제거

        //5단계 : 빈문자열일 경우 a 대입
        answer = answer.toString().equals("")? "aaa" : answer;

        //6단계 : 16자리일 경우 문자열 자르기 이때 맨 끝에 .일 경우 자르기
        answer = answer.length() > 16? answer.substring(0,15) : answer;
        answer = answer.replaceAll("[.]$", "");

        //7단계 : 길이가 2자 이하 일 경우 마지막 문자 반복하여 3자리 만들기
        while(answer.length() < 3)
            answer = answer + answer.charAt(answer.length()-1);
        return answer;

    }
}
