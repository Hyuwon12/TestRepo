package testpackage;

import java.io.*;

public class Test1436 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        T1436();
    }
    public static void T1436()throws IOException{
        int n = Integer.parseInt(br.readLine());
        int count=0;
        int m=0;
        for(int i=0;true;i++){

            if(n==count){
                break;
            }
            if(String.valueOf(i).contains("666")){
                count++;
                m=i;
            }
        }
        bw.write(String.valueOf(m));
        bw.flush();
    }
}
