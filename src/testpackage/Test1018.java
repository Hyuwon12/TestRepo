package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test1018 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        T1018();
    }
    public static void T1018() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N= Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] arr = new String[N];
        for (int i=0;i<N;i++){
            arr[i]=(br.readLine());
        }
        int result = Integer.MAX_VALUE;
        for(int i=0;i<N-7;i++){
            for(int j=0;j<M-7;j++){
                for(int k=0;k<2;k++){
                    char start = k == 0?'W':'B';
                    int count = 0;
                    for(int n=i;n<i+8;n++){
                        for (int m=j;m<j+8;m++){
                            if(start !=arr[n].charAt(m)){
                                count++;
                            }
                            start = start=='W'?'B':'W';
                        }
                        start = start == 'W'? 'B':'W';
                    }
                    result = Math.min(result,count);
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
