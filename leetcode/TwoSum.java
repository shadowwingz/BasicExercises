import java.util.HashMap;

/**
 * created by shadowwingz on 2020-07-11 21:19
 *
 * 给出一个整数数组，请在数组中找出两个加起来等于目标值的数，
 * 你给出的函数twoSum 需要返回这两个数字的下标（index1，index2），需要满足 index1 小于index2.。注意：下标是从1开始的
 * 假设给出的数组中只存在唯一解
 * 例如：
 * 给出的数组为 {2, 7, 11, 15},目标值为9
 * 输出 index1=1, index2=2
 */
public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(result[0] + " " + result[1]);
    }

    private int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            /**
             * map.containsKey(numbers[i]) 说明找到了需要的差值 result[1]，
             * 接下来需要找到第一个值的索引 result[0]，
             * result[0] 我们之前有保存过，在 HashMap 中，value 就是索引，所以 map.get(numbers[i]) 就能获取索引，
             * 但是这个索引是编程中数组的索引，下标从 0 开始，我们需要相应的 +1，得到我们需要的索引。
             * 接下来需要找到第二个值（差值）的索引 result[1]，results[1] 的数组索引是 i，所以我们需要的索引就是 i + 1
             */
            if (map.containsKey(numbers[i])) {
                result[0] = map.get(numbers[i]) + 1;
                result[1] = i + 1;
                break;
            } else {
                /**
                 * {7, 0}
                 * key 是差值，value 是索引
                 * 之所以要把差值作为 key 是因为后面遍历的时候可以直接拿数组的值 numbers[i] 和 key 比较，
                 * 如果相同，说明当前值 numbers[i] 就是我们要找的值 result[1]。
                 */
                map.put(target - numbers[i], i);
            }
        }
        return result;
    }
}
