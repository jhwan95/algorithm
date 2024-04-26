package 브루트포스_재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://kwoncorin.tistory.com/103
// 미완성
public class 암호만들기1759 {

    static int L, C;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();

        L = Integer.parseInt(line.split(" ")[0]);
        C = Integer.parseInt(line.split(" ")[1]);

        line = br.readLine();
        List<Character> 모음 = new ArrayList<>();
        List<Character> 자음 = new ArrayList<>();

        for(int i=0; i<line.length(); i++){

            Character alpha = line.charAt(i);
            if(alpha.equals('a') || alpha.equals('e') || alpha.equals('i')
            || alpha.equals('o') || alpha.equals('u')) {

                모음.add(alpha);
            }else{

                자음.add(alpha);
            }
        }
        Collections.sort(모음);
        Collections.sort(자음);
    }
}
