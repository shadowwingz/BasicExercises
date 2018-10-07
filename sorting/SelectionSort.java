package sorting;

/**
 * 一种最简单的排序算法是这样的：
 * 首先，找到数组中最小的那个元素，其次，将它和数组的第一个元素交换位置
 * （如果第一个元素就是最小元素那么它就和自己交换）。
 * 然后，在剩下的元素中找到最小的元素，将它与数组的第二个元素交换位置。
 * 如此往复，直到将整个数组排序。这种方法叫 选择排序，因为它在不断地选择剩余元素之中的最小者。
 * <p>
 * Created by shadowwingz on 2018-10-07 14:38
 */
public class SelectionSort extends BaseSort {

    @Override
    public void sort(Comparable[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            /**
             * 先假设最小值的索引是 i
             */
            int min = i;
            /**
             * 遍历数组，如果找到比 array[i] 还小的数，
             * 那就说明最小值不是 array[i]，把 min 的值替换为找到的最小值的索引。
             *
             * 比如，min 一开始等于 0，遍历到第二个元素时，发现第二个元素比 array[0]小，
             * 那么 min 此时是 1，继续遍历，遍历到第四个元素时，发现第四个元素比 array[1] 小，
             * 那么 min 此时是 3。遍历完之后，min 的值就可以确定下来了。也就是说，最小值可以确定下来了。
             */
            for (int j = i + 1; j < len; j++) {
                if (less(array[j], array[min])) {
                    min = j;
                }
            }

            /**
             * 最小值确定下来之后，我们把最小值和 array[i] 交换位置。
             *
             * 第一次遍历的时候，array[0] 和 最小值交换位置。
             * 第二次遍历的时候，array[1] 和 剩余数组的最小值交换位置。
             * ...
             */
            exchange(array, i, min);
        }
    }

    public static void main(String[] args) {
        System.out.println("选择排序\n");
        SelectionSort selectionSort = new SelectionSort();
        Comparable[] array = {1, 2, 5, 4, 3};
        printOriginArray(array);
        selectionSort.sort(array);
        printSortedArray(array);
    }
}
