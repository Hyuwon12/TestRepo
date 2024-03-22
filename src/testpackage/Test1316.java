package testpackage;

import javax.management.StringValueExp;
import java.io.*;

public class Test1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        int count=0;
            for(int i=0;i<n;i++){
                if(check()){
                    count++;
                }
            }
        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
    }
    public static boolean check() throws IOException{
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = (br.readLine());

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i); 	// i 번째 문자 저장 (현재 문자)

            // 앞선 문자와 i 번째 문자가 같지 않다면?
            if (prev != now) {
                // 해당 문자가 처음 나오는 경우 (false 인 경우)
                if ( check[now - 'a'] == false ) {
                    check[now - 'a'] = true;		// true 로 바꿔준다
                    prev = now;					// 다음 턴을 위해 prev 도 바꿔준다
                }
                // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨)
                else {
                    return false;	//함수 종료
                }
            }
            // 앞선 문자와 i 번째 문자가 같다면? (연속된 문자)
            // else 문은 없어도 됨
            else {
                continue;
            }
        }
        return true;
    }
}
