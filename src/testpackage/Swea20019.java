package testpackage;

import java.io.*;

public class Swea20019 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        Swea20019();
    }
    public static void Swea20019 () throws IOException {
        int t = Integer.parseInt(br.readLine());
        for (int i=0;i<t;i++){
            String input = br.readLine();
            int count=0;
            // 1. 회문인지 판별
            for(int j=0;j<(input.length()-1)/2;j++){
                if(input.charAt(j)==input.charAt(input.length()-j-1)){
                    count+=1;
                }
            }

            //2.회문의 회문인지 판별

            String input2=input.substring(0,(input.length()-1)/2);
            if (input2.length()==2){
                if(input2.charAt(0)==input2.charAt(1)){
                    count+=1;
                }
            }
            else {
                for(int j=0;j<(input2.length()-1)/2;j++){
                    if(input2.charAt(j)==input2.charAt(input2.length()-j-1)){
                        count+=1;
                    }
                }
            }
            bw.write("#"+i+" ");
            if(count>input2.length()){
                bw.write("YES");
            }else {
                bw.write("NO");
            }
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
