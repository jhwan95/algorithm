package 기타;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분산처리1009 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<testCase; i++){
            String arr = br.readLine();
            int a = Integer.parseInt(arr.split(" ")[0]);
            int b = Integer.parseInt(arr.split(" ")[1]);


            long answer = caculate(a, b);
            sb.append(answer + "\n");
        }

        System.out.println(sb);
    }

    public static long caculate(int a, int b){
        int k = a;
        for(int i=0; i<b-1; i++){
//            System.out.println("i : " + i);

            if(a==10 || a==20 || a==30 || a==40 ||
                    a==50 || a==60 || a==70 || a==80 || a==90)
                return 10;

            a=k*a;
//            System.out.println("a : " + a);
            while(a>10){

                a=a%10;
//                System.out.println(a);
            }
        }
        return a;

    }

}
