package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 미완성
public class 수이어쓰기1748 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        while(n>=1){

            count += String.valueOf(n).length();

            n -= 1;
        }

        System.out.println(count);
    }
}
