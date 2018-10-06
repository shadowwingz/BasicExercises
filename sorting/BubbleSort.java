package sorting;

import util.Utils;

/**
 * Created by shadowwingz on 2018-10-06 17:58
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * <p>
     * 冒泡排序可以算是最经典的排序算法了，实现方法也是非常的简单，两层 for 循环，
     * 里层循环中判断相邻两个元素是否逆序，是的话将两个元素交换，
     * 外层循环一次，就能将数组中剩下的元素中最小的元素"浮"到最前面，所以称之为冒泡排序。
     * 初始状态：  [24, 19, 26, 39, 36, 7, 31, 29, 38, 23]
     * 内层第一趟： [19, 24, 26, 39, 36, 7, 31, 29, 38, 23] （ 1th [19] <-> 0th [24] ）
     * 内层第二趟： [19, 24, 26, 39, 36, 7, 31, 29, 38, 23] （ 19 、26 都位于正确的顺序，无需交换）
     * 内层第三趟： [19, 24, 26, 39, 36, 7, 31, 29, 38, 23] （ 19 、39 都位于正确的顺序，无需交换）
     * 内层第四趟： [19, 24, 26, 36, 39, 7, 31, 29, 38, 23] （ 4th [36] <-> 3th [39] ）
     * 内层第五趟： [19, 24, 26, 36, 7, 39, 31, 29, 38, 23] （ 5th [7] <-> 4th [39] ）
     * 内层第六趟： [19, 24, 26, 36, 7, 31, 39, 29, 38, 23] （ 6th [31] <-> 5th [39] ）
     * 内层第七趟： [19, 24, 26, 36, 7, 31, 29, 39, 38, 23] （ 7th [29] <-> 6th [39] ）
     * 内层第八趟： [19, 24, 26, 36, 7, 31, 29, 38, 39, 23] （ 8th [38] <-> 7th [39] ）
     * 内层第九趟： [19, 24, 26, 36, 7, 31, 29, 38, 23, 39] （ 9th [23] <-> 8th [39] ）
     * <p>
     * 到这里，数组中的最大值 39 就被筛选出来了。外层每循环一次，就会筛选出当前数组的最大值。
     *
     * @param array 待排序的数组
     * @param <T>   ...
     * @return 排序后的数组
     */
    private <T extends Comparable<T>> T[] bubbleSorting(T[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                /**
                 * 比较后者（j）与前者（i）的关系，
                 * 如果后者比前者小就交换
                 */
                int compare = array[j].compareTo(array[i]);
                if (compare < 0) {
                    T temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
            System.out.println("i = " + i + " array = ");
            Utils.printArray(array);
        }
        return array;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSorting = new BubbleSort();
        Integer[] object = {24, 19, 26, 39, 36, 7, 31, 29, 38, 23};
        System.out.println("\n冒泡排序\n");
        Integer[] result = bubbleSorting.bubbleSorting(object);
        System.out.println("\n冒泡排序\n");
        Utils.printArray(result);
    }
}
