package testpackage;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Test28278 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        T28278();
    }
    static public void T28278() throws IOException {
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            switch (a){
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if(stack.isEmpty()||stack.size()==1){
                    System.out.println(-1);
                    }else {
                    System.out.println(stack.pop());
                    }
                    break;
                case 3:
                    System.out.println(stack.size());
                    break;
                case 4:
                    if (stack.isEmpty()){
                    System.out.println(1);
                    }else {
                        System.out.println(0);
                    }
                    break;
                case 5:
                    if(stack.isEmpty()){
                        System.out.println(-1);
                    }else {
                        System.out.println(stack.peek());
                    }
                    break;
            }
        }
    }
}

