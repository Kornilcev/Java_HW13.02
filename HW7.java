package lesson7;

import java.util.Arrays;

public class HW7 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 4, -2, 7, -12};
        System.out.println(" ; " + Arrays.toString(a));
        makeArrayElementsPositive(a);
        System.out.println(" ; " + Arrays.toString(a));
        System.out.println(hasNegative(a));
        int b[] = {1, 3, 10, 12};
        System.out.println("a before makeArrayElementsPositive: " + Arrays.toString(a));
        makeArrayElementsPositive(a);
        System.out.println("a after makeArrayElementsPositive: " + Arrays.toString(a));
        reverse(b);
        System.out.println("b after reverse: " + Arrays.toString(b));

    }


    public static boolean hasNegative(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                return true;
            }
        }
        return false;
    }

    public static void makeArrayElementsPositive(int[] b) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] < 0) {
                b[i] = b[i] * -1;
            }

        }
    }

    public static void reverse(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            int temp = a[i];
            a[i] = a[a.length -1 -i] = temp;
        }


    }
}
