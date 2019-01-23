package leetcode1_100;

/*
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
*/

public class PalindromeNumber {
    public  boolean isPalindrome(int x){
        if(x<0 || x!=0 && x%10==0) return false;
        int palind= x;
        int rev=0;
        while (x>0){
            rev=rev*10+x%10;
            x /=10;
        }
        return palind==rev;
    }

}

