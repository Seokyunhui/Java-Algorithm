package practice;

import java.util.Stack;

public class ADeliveryBox {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> assist= new Stack<>();
        int idx = 0;
        int num = 1;
        while(true){
            if(idx == order.length)
                break;
            if(!assist.empty() && assist.peek() == order[idx]) {

                assist.pop();
                idx++;
                ++answer;
            }else {
                if(num > order.length)
                    break;
                assist.push(num);

                ++num;
            }
        }


        return answer;
    }
}
