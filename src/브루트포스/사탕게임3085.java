package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사탕게임3085 {

    static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        int n = Integer.parseInt(br.readLine());
        arr = new char[n][n];

        for(int i=0; i<n; i++){

            String line = br.readLine();
            for(int j=0; j<n; j++){
                arr[i][j] = line.charAt(j);
            }
        }
        int answer = 0;
        for(int i=0; i<n; i++){

            for(int j=0; j<n; j++){

                for(int k=0; k<4; k++){

                    int nextX = i + dx[k];
                    int nextY = j + dy[k];

                    if(nextX>=0 && nextY>=0 && nextX<n && nextY<n){

                        // 바꾸고
                        swap(i, j, nextX, nextY);

                        // 큰 값 확인하고
                        int candidate = 0;
                        for(int l = 0; l<n; l++){
                            if(l==0){
                                candidate++;
                                continue;
                            }

                            if(arr[l][j] == arr[l-1][j]){
                                candidate++;
                                if(l==n-1){
                                    answer = Math.max(answer, candidate);
                                }
                            }else{
                                answer = Math.max(answer, candidate);
                                candidate = 1;
                            }
                        }

                        candidate = 0;
                        for(int l = 0; l<n; l++){
                            if(l==0){
                                candidate++;
                                continue;
                            }

                            if(arr[i][l] == arr[i][l-1]){
                                candidate++;

                                if(l==n-1){
                                    answer = Math.max(answer, candidate);
                                }
                            }else{
                                answer = Math.max(answer, candidate);
                                candidate = 1;
                            }
                        }

                        // 롤백하고
                        swap(i, j, nextX, nextY);
                    }
                }
            }
        }

        System.out.println(answer);
    }

    public static void swap(int i, int j, int nextX, int nextY){

        char temp = arr[i][j];
        arr[i][j] = arr[nextX][nextY];
        arr[nextX][nextY] = arr[i][j];
    }
}

/*
    소원 : 믿음, 지혜, 용기

 */