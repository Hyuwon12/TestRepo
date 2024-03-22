package testpackage;

import java.io.*;

public class Test2587 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        T2587();
    }
    public static void T2587()throws IOException{
        int[] arr = new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        bw.write(String.valueOf(sum/5));
        bw.newLine();
        bw.write(String.valueOf(arr[2]));
        bw.flush();
    }
}
