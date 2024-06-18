package practice;
/* 성격유형검사 (https://school.programmers.co.kr/learn/courses/30/lessons/118666)
* */
public class PersonalityTypeTest {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] result = {0,0,0,0,0,0,0,0};


        for(int i = 0; i < survey.length; i ++){
            if (survey[i].charAt(0) == 'R'){
                if(choices[i] < 4 )result[0] += 4 - choices[i];
                else result[1] += choices[i] - 4;
            }
            if (survey[i].charAt(0) == 'T'){
                if(choices[i] < 4 )result[1] += 4 - choices[i];
                else result[0] += choices[i] - 4;
            }
            if (survey[i].charAt(0) == 'C'){
                if(choices[i] < 4 )result[2] += 4 - choices[i] ;
                else result[3] += choices[i] - 4;
            }
            if (survey[i].charAt(0) == 'F'){
                if(choices[i] < 4 )result[3] +=4 - choices[i]  ;
                else result[2] += choices[i] - 4;
            }
            if (survey[i].charAt(0) == 'J'){
                if(choices[i] < 4 )result[4] += 4 - choices[i]  ;
                else result[5] += choices[i] - 4;
            }
            if (survey[i].charAt(0) == 'M'){
                if(choices[i] < 4 )result[5] += 4 - choices[i]  ;
                else result[4] += choices[i] - 4;
            }
            if (survey[i].charAt(0) == 'A'){
                if(choices[i] < 4 )result[6] += 4 - choices[i] ;
                else result[7] += choices[i] - 4;
            }
            if (survey[i].charAt(0) == 'N'){
                if(choices[i] < 4 )result[7] += 4 - choices[i] ;
                else result[6] += choices[i] - 4;
            }
        }
        answer += result[0] >= result[1]  ? "R" : "T" ;
        answer += result[2] >= result[3]  ? "C" : "F" ;
        answer += result[4] >= result[5]  ? "J" : "M" ;
        answer += result[6] >= result[7]  ? "A" : "N" ;


        return answer;
    }
}
