package LeetCode.DFS.Pid17电话号码的字母组合;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * created by popma
 * created time: 2020/3/15, 16:15
 */
public class MainClass {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return input.toString();
    }

    public static String stringListToString(List<String> stringList) {
        StringBuilder sb = new StringBuilder("[");
        for (String item : stringList) {
            sb.append(item);
            sb.append(",");
        }

        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String digits = stringToString(line);

            List<String> ret = new Solution().letterCombinations(digits);

            String out = stringListToString(ret);

            System.out.print(out);
        }
    }
}
