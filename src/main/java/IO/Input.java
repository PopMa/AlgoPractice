package IO;

import java.util.Scanner;

/**
 * created by popma
 * created time: 2020/5/5, 22:43
 */
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println(n);
        }
    }
}
