package 프로그래머스.스택큐;

import java.util.Stack;

public class 올바른괄호 {

    boolean solution(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){

            if(stack.isEmpty()){
                if(s.charAt(i)=='('){
                    stack.add('(');
                }else{
                    return false;
                }
            }
            else {
                if (s.charAt(i) == '(') {
                    stack.add('(');
                } else {
                    stack.pop();
                }
            }
        }

        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
}
