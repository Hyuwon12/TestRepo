package testpackage;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Test10773 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        Test10773();
    }
    static public void Test10773() throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<k;i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if(n==0){
                stack.pop();
            } else {
                stack.push(n);
            }
        }
        int sum =0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        br.close();
        bw.close();
    }
}
