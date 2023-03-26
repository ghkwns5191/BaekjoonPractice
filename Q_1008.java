import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        
        double a, b;
        a = Double.valueOf(tokenizer.nextToken());
        b = Double.valueOf(tokenizer.nextToken());
        
        double answer;
        answer = a / b;
        System.out.println(answer);
    }
    
}