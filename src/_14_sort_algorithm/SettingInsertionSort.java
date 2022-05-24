package _14_sort_algorithm;

import java.util.Arrays;

public class SettingInsertionSort {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 10, 8};
        int pos;
        int x;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; //đổi chỗ lên đầu
                pos--;
            }
            array[pos] = x;
        }
        System.out.println(Arrays.toString(array));
    }
}

