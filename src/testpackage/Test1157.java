package testpackage;

import java.io.*;

public class Test1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[26];
        String s = (br.readLine());
        for (int i=0;i<s.length();i++){
            if ('A'<=s.charAt(i)&&s.charAt(i)<='Z'){
                arr[s.charAt(i)-'A']++;
            }
            else
                arr[s.charAt(i)-'a']++;
        }
        int max=0;
        char ch='?';
        for (int i=0;i<26;i++){
            if (arr[i]>max){
                max=arr[i];
                ch=(char)(i+65);
            }
            else if (arr[i]==max){
                ch = '?';
            }
        }bw.write(String.valueOf(ch));
        bw.flush();
    }
}