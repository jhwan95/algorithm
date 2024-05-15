package 프로그래머스.스택큐;

import java.util.Collections;
import java.util.PriorityQueue;

// https://ittrue.tistory.com/528
public class 프로세스 {

    public static void main(String[] args){

        int[] priorities = {1, 1, 9, 1, 1, 1};

        System.out.println(solution(priorities, 0));

    }

    // 문제점
    // 1. location이 가르키는 priorities의 순위가 동일순위가 있을 경우
    // 어떻게 구별할 것인가.
    // 2.
    
    // 언제 답지를 볼까?
    // 1. 문제를 외웠을때 
    // 2. 문제를 외운 상태로 3회정도 생각했을 때, 그래도 답이 보이지 않을때

    public static int solution(int[] priorities, int location) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int priority : priorities){
            queue.offer(priority);
        }

        int answer = 0;
        while(!queue.isEmpty()){

            for(int i=0; i< priorities.length; i++){

                if(queue.peek() == priorities[i]){
                    queue.poll();
                    answer++;

                    if(i == location){
                        return answer;
                    }

                }
            }
        }

        return answer;
    }
}
