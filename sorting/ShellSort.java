/**
 * 希尔排序
 * <p>
 * Created by shadowwingz on 2019-02-13 21:32
 */
public class ShellSort extends BaseSort {

    @Override
    public void sort(Comparable[] array) {
        int N = array.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(array[j], array[j - h]); j -= h) {
                    exchange(array, j, j - h);
                    printArray(array);
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        System.out.println("希尔排序\n");
        ShellSort shellSort = new ShellSort();
        Comparable[] array = {3, 4, 7, 2, 6, 5, 1, 8, 9};
        printOriginArray(array);
        shellSort.sort(array);
        printSortedArray(array);
    }
}
