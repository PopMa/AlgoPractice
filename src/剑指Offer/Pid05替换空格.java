package 剑指Offer;

/**
 * created by popma
 * created time: 2020/4/5, 14:58
 * 将一个字符串中的空格替换成 "%20"。
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 */
public class Pid05替换空格 {
    public static String replaceSpace(String s) {
        // 扩充长度
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                str.append("  ");
            }
        }

        int p1 = s.length() - 1;
        int p2 = str.length() - 1;
        while (p1 >= 0 && p2 > p1) {
            char c = str.charAt(p1--);
            if (c == ' ') {
                str.setCharAt(p2--, '0');
                str.setCharAt(p2--, '2');
                str.setCharAt(p2--, '%');
            } else {
                str.setCharAt(p2--, c);
            }
//            p1--;
        }
        return str.toString();
    }

    public static String replaceSpace2(String s) {
        StringBuffer res = new StringBuffer();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                res.append("%20");
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String res = replaceSpace2("We are happy.");
        System.out.println(res);

    }

}
