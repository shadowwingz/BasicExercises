package sorting;

/**
 * 通常人们整理扑克牌的方法是一张一张的来，将每一张牌插入到其他已经有序的牌中的适当位置。
 * 在计算机的实现中，为了给要插入的元素腾出空间，我们需要将其余所有元素在插入之前都向右移动一位。
 * 这种算法叫 插入排序。
 * <p>
 * Created by shadowwingz on 2018-10-06 20:47
 */
public class InsertSort extends BaseSort {

    /**
     * 插入排序的基本思想是，在遍历数组的过程中，假设在序号 i 之前的元素，
     * 即 [0..i-1] 都已经排好序，本趟需要找到 i 对应的元素 x 的正确位置 k，
     * 并且在寻找这个位置 k 的过程中逐个将比较过的元素往后移一位，为元素 x “腾位置”,
     * 最后将 k 对应的元素值赋为 x，插入排序也是根据排序的特性来命名的。
     *
     * @param array 待排序的数组
     */
    @Override
    public void sort(Comparable[] array) {
        int len = array.length;
        // 每个元素选取出来作为插入元素
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0 && less(array[j], array[j - 1]); j--) {
                exchange(array, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();
        System.out.println("插入排序\n");
        Comparable[] array = {1, 2, 5, 4, 3};
        printOriginArray(array);
        insertSort.sort(array);
        printSortedArray(array);
    }
}
