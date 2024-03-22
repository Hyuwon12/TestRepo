package testpackage;

import java.io.*;

public class Test1193 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int x = Integer.parseInt(br.readLine());
        String[][] arr = new String[x][x];
        int k =1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[j][i]=(j+1)+"/"+k;
            }
            k++;
        }

        /*
        x=1 arr[0][0]
        x=2 arr[0][1]
        x=3 arr[1][0]
        x=4 arr[1][1]
        x=5 arr[0][2]
        x=6 arr[1][2]
        x=7 arr[2][0]
        x=8 arr[2][1]
        x=9 arr[2][2]
         */
        int x1=0;
        int y1=0;
        for(int i=0;i<x;x--){
            if(x1==y1){
                y1++;
                continue;
            }
            if(x1<y1){
                x1++;
            }
        }
        bw.write(arr[x1][y1]);
        bw.flush();
        br.close();
    }
}
