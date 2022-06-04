package funyyyy;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-1, 150, 190, 170, -1, -1, 160, 180};
        int x;
        int pos;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == -1) {
                i++;
            }
            x = arr[i];
            pos = i;
            while (pos > 0 && arr[pos - 1] > x) {
            arr[pos]= arr[pos-1];
            pos--;
            }
            arr[pos]=x;
//            for (int j = i + 1; j < arr.length - 2; j++) {
//                if (j == -1) {
//                    j++;
//                }
//            }
        }
        System.out.println(Arrays.toString(arr));
    }
}