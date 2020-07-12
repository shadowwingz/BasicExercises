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
             * map.containsKey(numbers[i]) 说明找到了需要的差值 result[1]，numbers[i] 就是 result[1]
             */
            if (map.containsKey(numbers[i])) {
                /**
                 * result[0] 是我们要找的第一个索引值，我们之前存储过这个索引，
                 * 所以可以直接用 numbers[i] 作为 key 来取出这个索引。
                 */
                result[0] = map.get(numbers[i]) + 1;
                /**
                 * result[1] 是我们要找的第二个索引值（差值的索引），也就是 i 的值。
                 */
                result[1] = i + 1;
                /**
                 * 这里 break 可以提前停止循环，减少不必要的运算。
                 */
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
        System.out.println(map);
        return result;
    }
}
