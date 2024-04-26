package 대기업계열사코테문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 돌게임9655 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n%2==0){
            System.out.println("CY");
        }else{
            System.out.println("SK");
        }
    }
}
