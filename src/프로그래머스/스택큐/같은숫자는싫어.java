package 프로그래머스.스택큐;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class 같은숫자는싫어 {

    public int[] solution(int []arr) {

        Queue<Integer> queue = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<arr.length; i++){

            if(stack.isEmpty()){
                stack.add(arr[i]);
            }else{
                if(stack.peek() == arr[i]){

                }else{
                    stack.add(arr[i]);
                }
            }
        }

        int[] answer = new int[stack.size()];

        for(int i=answer.length-1; i>=0; i--){

            answer[i] = stack.pop();
        }

        return answer;
    }
}
