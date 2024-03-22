package testpackage;

import java.io.*;


public class Test10798 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        char[][] arr = new char[5][15];
        for(int i=0;i<5;i++){
            String s = (br.readLine());
            for(int j=0;j<s.length();j++){
                arr[i][j]=s.charAt(j);
            }
        }

        for (int i=0;i<arr.length;i++){
            for(int j=0;j<5;j++){
                if(arr[j][i]=='\0'){
                    continue;
                }
                bw.write(String.valueOf(arr[j][i]));
            }
        }
        bw.flush();
        br.close();
    }

}
