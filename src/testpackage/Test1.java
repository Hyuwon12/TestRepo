package testpackage;

import java.io.*;
import java.util.StringTokenizer;

/*
    한 패키지 안에 여러 클래스나 패키지가 존재가능 (단, 동일한 이름의 패키지나 클래스는 불가)
    서로 다른 패키지일 경우 동일한이름의 패키지나 클래스 존재가능
    즉, 같은 경로내에서는 패키지명과 클래스명은 고유해야함.

    기본 src 패키지 경로에 클래스를 만드는것은 권장하지않음 ( 클래스를 관리하기 불편하기 때문)
    기본패키지에 만들어진 클래스는 다른 패키지에서 접근할수 없기때문

    권장사항*
    1. 패키지는 적어도 세단계이상으로 만들어주는것을 권장
    2. 패키지의 두번째 레벨까지는 도메인의 역순으로 사용 ( 도메인은 고유한 이름이기때문에 중복을 방지할 수 있다.)
    (ex. com.kh.project01.test.Class)

    패키지 명명규칙
    1. 패키지명은 항상 첫글자 소문자로 작성한다.
    2. 클래스명은 항상 첫글자 대문자로 작성한다.
    3. 메소드명도 항상 첫글자 소문자로 작성한다.

    Method(메소드) : 기능을 의미한다 . 하나의 기능단위
    한개의 클래스 안에 여러메소드가 존재가능
    메소드는 일반 메소드와 메인메소드로 나뉘며 일반메소드는 호출되어 사용된다.
    최종적으로 메인메소드의 호출이 있어야 프로그램이 동작하게 된다.
 */
public class Test1 {

    public void methodB() throws IOException{
        System.out.println("백준 4344");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int C = Integer.parseInt(br.readLine());
        for (int i=0; i<C; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            double sum = 0;
            for (int j=0; j<N; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            double stack =0;
            for (int j=0; j<N; j++) {
                if (arr[j] > sum/N) {
                    stack++;
                }
            }
            double per = stack/N * 100;
            bw.write(String.format("%.3f",per));
            bw.newLine();
            }
        bw.flush();
        }

    }


