package 프로그래머스.스택큐;

import java.util.*;

public class 기능개발 {


    public int[] solution(int[] progresses, int[] speeds) {

        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();


        for(int i=0; i<progresses.length; i++){
            double value = (100-progresses[i])/(double)speeds[i];
            int day = (int)Math.ceil(value);

            if(!queue.isEmpty() && queue.peek() < day){
                answer.add(queue.size());
                queue.clear();
            }

            queue.offer(day);
        }


        int[] returnAnswer = new int[answer.size()];
        for(int i=0; i<answer.size(); i++){

            returnAnswer[i] = answer.get(i);
        }
        return returnAnswer;

    }

    // 배열 풀이
//    public int[] solution(int[] progresses, int[] speeds) {
//        List<Integer> answerList = new ArrayList<>();
//
//        int j = 0;
//        while(j<progresses.length){
//
//
//            for(int i=0; i<progresses.length; i++){
//
//                progresses[i] = progresses[i] + speeds[i];
//            }
//
//            int count = 0;
//            while(j<progresses.length){
//
//                if(progresses[j] >= 100){
//                    count++;
//                    j++;
//                }else{
//                    break;
//                }
//            }
//
//            if(count != 0){
//
//                answerList.add(count);
//            }
//        }
//
//        int[] answer = new int[answerList.size()];
//        for(int i = 0; i<answerList.size(); i++){
//
//            answer[i] = answerList.get(i);
//        }
//
//
//        return answer;
//    }
}
