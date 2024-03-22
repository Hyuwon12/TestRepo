package testpackage;

import java.util.Arrays;

public class StringPool {
    public static void main(String[] args) {
        String str1="강아지";// StringPool에 생성
        String str2="강아지";// StringPool에 생성된 값 str1을 가져옴(같은 주소값,문자열 특이케이스)
        String str3=new String("강아지");//   heap영역에 새로 생성(st1과 서로 다른 주소값을 가짐)
        String str4=new String("강아지");//   heap영역에 새로 생성(st1,str3과 서로 다른 주소값을 가짐)
        String str5="강아지";//str1과 같은 StringPool에 생성된 주소값을 가져옴

        //주소값 찍어보기
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
        System.out.println(System.identityHashCode(str5));

        //배열의 얕은 복사와 비슷한 개념
        int[] arr = new int[10];
        int[] arr2 = arr; //얕은복사 하나의 객체를 두 변수(arr,arr2)가 참조


        //새로운 배열 객체를 생성하여 기존 배열의 데이터를 복사하는 깊은복사
        for(int i=0;i<10;i++){
            arr2[i]=arr[i];
        }
        System.arraycopy(arr,0,arr2,0,arr.length);
        arr2 = Arrays.copyOf(arr,arr.length);
        arr2 = arr.clone();
    }
}
