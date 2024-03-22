package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = (br.readLine());

        int count=1;

        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                count=0;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
