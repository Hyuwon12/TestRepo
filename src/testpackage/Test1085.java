package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test1085 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T1085();
    }
    public static void T1085() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int min=1000;
        if(x<=y){
            if(min>x){
            min=x;
            }
        }
        if(w-x<h-y){
            if(min>w-x){
                min=w-x;
            }
        }

        else if(y<=x){
            if (min>y){
                min=y;
            }
        }
        if(h-y<w-x){
            if(min>h-y){
                min=h-y;
            }
        }
        bw.write(String.valueOf(min));
        bw.flush();
        br.close();
    }
}
