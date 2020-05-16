import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * created by popma
 * created time: 2020/3/15, 10:31
 */
public class Demo {
    public static void main(String[] args) {

        LinkedList<String> link = new LinkedList<String>();
        //添加元素
        link.addFirst("大乔");
        link.addFirst("小桥");
        link.addFirst("老乔");
        System.out.println(link);
        // 获取元素
        System.out.println(link.getFirst());
        System.out.println(link.getLast());

        link.push("big");
        System.out.println(link.pop());
        // 删除元素
//        System.out.println(link.removeFirst());
//        System.out.println(link.removeLast());
//
//        while (!link.isEmpty()) { //判断集合是否为空
//            System.out.println(link.pop()); //弹出集合中的栈顶元素
//        }

        System.out.println(link);
    }

    @Test
    public void demo2() {
        int[] dp = new int[2];
        System.out.println(dp[1]);
    }

    @Test
    public void test2() {
        System.out.println(3 / 2);
    }

}
