package testpackage;

import java.io.*;

public class Test2941 {//나중에 다시 확인하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = (br.readLine());
        int count =0;
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if (c == 'c') {
                boolean b = str.charAt(i + 1) == '=' | str.charAt(i + 1) == '-';
                {
                    count++;
                }
            }
            else if (c == 'd') {
                boolean b = str.charAt(i + 1) == '-';
                {
                    count++;
                }
                boolean b2 = str.charAt(i + 1) == 'z' & str.charAt(i + 2) == '=';
                {
                    count+=2;
                }
            }
            else if (c == 'l') {
                boolean b = str.charAt(i + 1) == 'j';
                {
                    count++;
                }
            }
            else if (c == 'n') {
                boolean b = str.charAt(i + 1) == 'j';
                {
                    count++;
                }
            }
            else if (c == 's') {
                boolean b = str.charAt(i + 1) == '=';
                {
                    count++;
                }
            }
            else if (c == 'z') {
                if(str.charAt(i-1)=='d'){
                    continue;
                }
                boolean b = str.charAt(i + 1) == '=';
                {
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.newLine();
        bw.write(String.valueOf(str.length()-count));
        bw.flush();
        }
    }

