package Sotrings;


import java.util.Arrays;

public class MergeSort {
    public static void sort(int arr[], int low, int mid, int high) {
        int i = low, j = mid + 1, k = low;
        int brr[] = new int[20];
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                brr[k] = arr[i];
                i++;
                k++;
            } else {
                brr[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            brr[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high) {
            brr[k] = arr[j];
            j++;
            k++;
        }
        for(int f = low;f<=high;f++){
            arr[f]=brr[f];
        }
    }

    public static void merge(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            merge(arr, low, mid);
            merge(arr, mid + 1, high);
            sort(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 5, 2, 4, 6, 3, 2, 4};
        merge(arr, 0, arr.length - 1);
       System.out.print(Arrays.toString(arr));
    }
}
