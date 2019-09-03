/**
 * 冒泡排序
 * <p>
 * Created by shadowwingz on 2018-10-06 17:58
 */
public class BubbleSort extends BaseSort {

    /**
     * 冒泡排序可以算是最经典的排序算法了，实现方法也是非常的简单，两层 for 循环，
     * 里层循环中判断相邻两个元素是否逆序，是的话将两个元素交换，
     * 外层循环一次，就能将数组中剩下的元素中最小的元素"浮"到最前面，所以称之为冒泡排序。
     *
     * @param array 待排序的数组
     */
    @Override
    public void sort(Comparable[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                /**
                 * 比较后者（j）与前者（i）的关系，
                 * 如果后者比前者小就交换
                 */
                if (less(array[j], array[i])) {
                    exchange(array, i, j);
                    printArray(array);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("冒泡排序\n");
        BubbleSort bubbleSort = new BubbleSort();
        Comparable[] array = {1, 2, 5, 4, 3};
        printOriginArray(array);
        bubbleSort.sort(array);
        printSortedArray(array);
    }
}
