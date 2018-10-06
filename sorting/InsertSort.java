package sorting;

import util.Utils;

/**
 * Created by shadowwingz on 2018-10-06 20:47
 */
public class InsertSort {

    /**
     * 插入排序的基本思想是，在遍历数组的过程中，假设在序号 i 之前的元素，
     * 即 [0..i-1] 都已经排好序，本趟需要找到 i 对应的元素 x 的正确位置 k，
     * 并且在寻找这个位置 k 的过程中逐个将比较过的元素往后移一位，为元素 x “腾位置”,
     * 最后将 k 对应的元素值赋为 x，插入排序也是根据排序的特性来命名的。
     *
     * @param array 待排序的数组
     * @param <T>   ...
     * @return 排序后的数组
     */
    private <T extends Comparable<T>> T[] insertSorting(T[] array) {
        int len = array.length;
        // 每个元素选取出来作为插入元素
        for (int i = 0; i < len; i++) {
            T toInsert = array[i];
            int j = i;
            for (; j > 0; j--) {
                /**
                 * 原来顺序系列里从最大的数开始 和 现在选择的比较，
                 * 如果找到比选择的数小的，就 break，
                 * 此时已经记下了坐标保存到 j 中。
                 */
                if (array[j - 1].compareTo(toInsert) <= 0) {
                    break;
                }
                /**
                 * 如果选择的元素比顺序系列里的数小，那么腾位置。
                 */
                array[j] = array[j - 1];
            }

            array[j] = toInsert;
            System.out.print("i = " + i + " array = ");
            Utils.printArray(array);
        }
        return array;
    }

    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();
        System.out.println("\n插入排序\n");
        Integer[] object = {1, 2, 5, 4, 3};
        Integer[] result = insertSort.insertSorting(object);
        System.out.println("");
        System.out.println("\n插入排序\n");
        Utils.printArray(result);
        System.out.println("\n插入排序\n");
    }
}
