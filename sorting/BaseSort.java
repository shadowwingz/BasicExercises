package sorting;

/**
 * Created by shadowwingz on 2018-10-06 22:31
 */
abstract class BaseSort {

    abstract public void sort(Comparable[] array);

    boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    void exchange(Comparable[] array, int i, int j) {
        Comparable t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    boolean isSorted(Comparable[] array) {
        // 测试数组元素是否有序
        for (int i = 0; i < array.length; i++) {
            if (less(array[i], array[i - 1])) {
                return false;
            }
        }
        return true;
    }

    static void printOriginArray(Comparable[] array) {
        System.out.println("排序前");
        for (Comparable data : array) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    static void printSortedArray(Comparable[] result) {
        System.out.println("排序后");
        for (Comparable data : result) {
            System.out.print(data + " ");
        }
    }
}
