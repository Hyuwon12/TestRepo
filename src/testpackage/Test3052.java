package testpackage;

import java.io.*;


public class Test3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] arr = new boolean[42];
        int count =0;
        for (int i=0;i<10;i++){
            arr[Integer.parseInt(br.readLine())%42]=true;
        }
        for(boolean value:arr){
            if (value){
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
    }
}
