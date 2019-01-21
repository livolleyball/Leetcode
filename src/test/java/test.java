import leetcode1_100.PalindromeSubstrings;
import leetcode1_100.TwoSum;
import org.junit.Test;
import static  org.junit.Assert.*;
import tools.TimeTrans;
// 静态引用

/*
在每个无参方法的上一行添加关键字
        注意:
        1.不能在类前用
        2.不能在有参数的方法前用
        */

public class test {
    @Test
    public void method1() {
        int[] nums1 = {3, 5, 6};
        System.out.println(Integer.MIN_VALUE);
    }

    @Test
    public void method2() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum s = new TwoSum();
        for (int i : s.twoSum(nums, target)) {
            System.out.println(i);
        }
    }

    @Test
    public void method5() {
        String s = "ababd";
        PalindromeSubstrings ps = new PalindromeSubstrings();
        String s1 = ps.longestPalindrome(s);
        String s2 = ps.longestPalindrome(s);
        assertEquals("aba",s1);
        assertEquals("aba",s2);
    }

    @Test
    public void method6() {
        String date = "Thu Dec 27 16:51:55 CST 2018";
        TimeTrans tt = new TimeTrans();
        String s1 = tt.timeTrans(date);
        System.out.println(s1);
        assertEquals("2018-12-27 16:51:55",s1);
    }
}

