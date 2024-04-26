package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 미완성
public class 사탕게임3085 {
    static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new char[n][n];

        for(int i=0; i<n; i++){

            String line = br.readLine();
            for(int j=0; j<n; j++){

                arr[i][j] = line.charAt(j);
            } // for
        } // for


        int answer = 0;
        for(int i=0; i<n; i++){

            for(int j=0; j<n-1; j++){

                int count = 1;
                swap(i, j, i, j+1);
                for(int k=1; k<n; k++){

                    if(arr[i][k] == arr[i][k-1]){

                        count++;
                        answer = Math.max(count, answer);
                    }else{
                        count = 1;
                    }
                }
                swap(i, j, i, j+1);
            }
        }

        for(int i=0; i<n-1; i++){

            for(int j=0; j<n; j++){

                int count = 1;
                swap(i, j, i+1, j);
                for(int k=1; k<n; k++){

                    if(arr[k][j] == arr[k-1][j]){

                        count++;
                        answer = Math.max(count, answer);
                    }else{
                        count=1;
                    }
                }
                swap(i, j, i+1, j);
            }
        }
        System.out.println(answer);
    }

    public static void swap(int i, int j, int nextX, int nextY){

        char temp = arr[i][j];
        arr[i][j] = arr[nextX][nextY];
        arr[nextX][nextY] = temp;
    }
}
