package testpackage;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,2,11,6,88,42,34,23,12,56,8,9,1};
        quickSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    public static void quickSort(int[] arr,int n,int m){
        if(n>=m){
            return;
        }
        // 가장 왼쪽의 값을 pivot으로 지정, 실제 비교 검사는 start+1 부터 시작
        int pivot = n;
        int low = n + 1;
        int high = m;

        // lo는 현재 부분배열의 왼쪽, hi는 오른쪽을 의미
        // 서로 엇갈리게 될 경우 while문 종료
        while (low <= high) {
            while (low <= m && arr[low] <= arr[pivot]) // 피벗보다 큰 값을 만날 때까지
                low++;
            while (high > n && arr[high] >= arr[pivot]) // 피벗보다 작은 값을 만날 때까지
                high--;
            if (low > high)				 // 엇갈리면 피벗과 교체
                swap(arr, high, pivot);
            else
                swap(arr, low, high);			 // 엇갈리지 않으면 lo, hi 값 교체
        }

        // 엇갈렸을 경우,
        // 피벗값과 hi값을 교체한 후 해당 피벗을 기준으로 앞 뒤로 배열을 분할하여 정렬 진행
        quickSort(arr, n, high - 1);
        quickSort(arr, high + 1, m);
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
