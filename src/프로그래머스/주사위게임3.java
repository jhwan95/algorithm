package 프로그래머스;

import java.util.*;

public class 주사위게임3 {

    public static void main(String[] args){

        solution(1, 2, 3, 4);

    }

    public static int solution(int a, int b, int c, int d) {

        Map<Integer, Integer> map = new HashMap<>();

        map.put(a, map.getOrDefault(a, 0)+1);
        map.put(b, map.getOrDefault(b, 0)+1);
        map.put(c, map.getOrDefault(c, 0)+1);
        map.put(d, map.getOrDefault(d, 0)+1);

        List<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list);

        int answer = 0;
        if(list.size()==1){
            answer = list.get(0)*1111;
        }
        else if(list.size()==2){

            if(map.get(list.get(0))==2){
                int p = list.get(0);
                int q = list.get(1);

                answer = (p+q)*Math.abs(p-q);

            }else{
                int p = map.get(list.get(0)) == 3 ? list.get(0) : list.get(1);
                int q = map.get(list.get(0)) == 1 ? list.get(0) : list.get(1);

                answer = (10*p+q)*(10*p+q);
            }

        }else if(list.size() == 3){
            int q, r;
            if(map.get(list.get(0))==2){
                q = list.get(1);
                r = list.get(2);
            }else if(map.get(list.get(1))==2){
                q = list.get(0);
                r = list.get(2);
            }else{
                q = list.get(0);
                r = list.get(1);
            }

            answer = q*r;
        }else{
            answer = list.get(0);
        }

        return answer;
    }
}
