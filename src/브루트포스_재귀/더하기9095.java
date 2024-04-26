package 브루트포스_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 완성
public class 더하기9095 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        int[] arr = new int[12];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for(int i=4; i<12; i++){

            arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
        }

        for(int i=0; i<testCase; i++){

            int receive = Integer.parseInt(br.readLine());
            int answer = arr[receive];

            sb.append(answer + "\n");
        }

        System.out.println(sb);
    }
}
