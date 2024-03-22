package testpackage;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test25305 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        T25305();
    }
    public static void T25305() throws IOException{
        // n개의 점수를 입력받고 오름차순으로 정렬한 후 m번째 수 출력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken())-1;
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int score = Integer.parseInt(st.nextToken());
            arr[i]=score;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        bw.write(String.valueOf(arr[m]));
        bw.flush();
    }
}
