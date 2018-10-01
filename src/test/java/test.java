import org.junit.Test;
import leetcode1_100.TwoSum;
import leetcode1_100.PalindromeSubstrings;

import static org.junit.Assert.*;
// 静态引用

/*
在每个无参方法的上一行添加关键字
        注意:
        1.不能在类前用
        2.不能在有参数的方法前用
        */

public class test {
    @Test
    public  void method1() {
        int[] nums1 = {3, 5, 6};
        System.out.println(Integer.MIN_VALUE);
    }

    @Test
    public void method2(){
        int[] nums={2,7,11,15};
        int target =9;
        TwoSum s=new TwoSum();
        for (int i:s.twoSum(nums,target)){
            System.out.println(i);
        }
    }

    @Test
    public void method5(){
        String s="ababd";
        PalindromeSubstrings ps=new PalindromeSubstrings();
        System.out.println(ps.longestPalindrome(s));
        System.out.println(ps.longestPalindrome2(s));
        }
    }

