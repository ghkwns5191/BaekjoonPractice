import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        
        String blank = " ";
        String star = "*";
        
        for (int i = 1; i <= t; i++) {
            bw.write(blank.repeat(t - i) + star.repeat(i));
            bw.newLine();
        }
        bw.close();
    }
}