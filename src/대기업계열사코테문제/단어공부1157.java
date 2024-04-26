package 대기업계열사코테문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 97 ~ 122
// 완
public class 단어공부1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        line = line.toLowerCase();
        int[] arr = new int[26];

        for(int i=0; i<line.length(); i++){
            int index = line.charAt(i)-97;
            arr[index]++;
        }

        int max = 0;
        boolean flag = false;
        char alpha = 'A';
        for(int i=0; i<arr.length; i++){

            if(arr[i] > max){
                max = arr[i];
                flag = false;
                alpha = (char)(i+97);
            }else if(arr[i]<max){

            }else{
                flag = true;
            }
        }

        if(flag){
            System.out.println("?");
        }else{

            System.out.println((char)(alpha-32));
        }

    }
}
