/* Reverse an array using recursion */

import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        int[] result = reverse(0, arr, len - 1);
        for (int i : result)
            System.out.print(i + " ");
    }

    public static int[] reverse(int i, int[] arr, int len) {
        if (i < len) {

            int temp = arr[i];
            arr[i] = arr[len];
            arr[len] = temp;
            reverse(i + 1, arr, len - 1);
        }
        return arr;
    }
}
