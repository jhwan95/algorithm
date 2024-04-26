import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();
        sb.append(a*(b%10) + "\n");
        sb.append(a*((b%100)/10) + "\n");
        sb.append(a*(b/100) + "\n");
        sb.append(a*b);

        System.out.println(sb);
    }
}