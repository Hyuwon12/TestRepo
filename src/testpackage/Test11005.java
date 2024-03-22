package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test11005 {
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        public static void main(String[] args) throws IOException {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            StringBuilder sb = new StringBuilder();
            while(n != 0){
                if(n%b >= 10) sb.append((char) ((n % b) + 55));
                else sb.append(n%b);
                n /= b;
            }

            bw.write(String.valueOf(sb.reverse()));
            bw.flush();
            br.close();
        }
    }

