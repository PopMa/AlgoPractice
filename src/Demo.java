import java.util.ArrayList;
import java.util.List;

/**
 * created by popma
 * created time: 2020/3/15, 10:31
 */
public class Demo {
    private static int getSum(List<Integer> temRes) {
        int sum = 0;
        for (int i : temRes) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);

        System.out.println(getSum(a));
    }
}
