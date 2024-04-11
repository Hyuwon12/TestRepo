import java.io.*;
import java.util.Stack;

public class Test9012 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Test9012();
    }
    static public void Test9012() throws IOException{
        int n= Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            Stack<Integer> stack = new Stack<>();
            int count=0;
            String str = br.readLine();

            for(int j=0;j<str.length();j++){
                count++;
                if(str.charAt(j)=='('){
                    stack.push(1);
                }else {
                    if(stack.isEmpty()){
                        bw.write("NO");
                        bw.newLine();
                        bw.flush();
                        break;
                    }else {
                        stack.pop();
                    }
                }
                if(stack.isEmpty()){
                    if(count==str.length()){
                        bw.write("YES");
                        bw.newLine();
                        bw.flush();
                        break;
                    }
                }
            }
            if(!stack.isEmpty()){
                bw.write("NO");
                bw.newLine();
                bw.flush();
            }
        }
    }
}
