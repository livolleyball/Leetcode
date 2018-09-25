import java.util.HashMap;

public class LongestSubstringWithoutRepeat {
    /*
        给定一个字符串，找出不含有重复字符的最长子串的长度。
        示例 1:

        输入: "abcabcbb"
        输出: 3
        解释: 无重复字符的最长子串是 "abc"，其长度为 3。
        示例 2:

        输入: "bbbbb"
        输出: 1
        解释: 无重复字符的最长子串是 "b"，其长度为 1。
        示例 3:

        输入: "pwwkew"
        输出: 3
        解释: 无重复字符的最长子串是 "wke"，其长度为 3。
        请注意，答案必须是一个子串，"pwke" 是一个子序列 而不是子串。
    */
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int res = 0;
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            System.out.println(map);
            System.out.println("start:"+res+" i:"+i +" j:"+j);
            res = Math.max(res, i - j + 1);
            System.out.println("end:"+res);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }

}
