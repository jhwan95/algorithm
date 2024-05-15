package 프로그래머스;

public class 등차수열의특정한항만더하기 {

    public static void main(String[] args){


    }

    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for(int i=0; i<included.length; i++){

            if(included[i]){
                answer = answer + (a + (i-1)*d);
            }
        }

        return answer;
    }
}
