package util;

/**
 * Created by shadowwingz on 2018-10-06 22:31
 */
public class Utils {
    public static <T extends Comparable<T>> void printArray(T[] array) {
        if (array == null || array.length == 0) return;
        for (T data : array) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
}
