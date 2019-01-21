package leetcode1_100;

/*

给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。

*/

public class ReverseInteger {
    public static int reverse(int x){
        long res =0;
        while (x!=0){
            res=res*10+x%10;
            x/=10; // 每循环一次，数字从右向左减少一位
            if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE) return 0;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        int x=123;
        System.out.println(reverse(x));
    }
}
