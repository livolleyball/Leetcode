package leetcode1_100;

/*
+ -
not valid
越界
*/

public class StringtoInteger {
    public static int myAtoi(String str){
        if(str==null || str.length()==0 || str.trim().length()==0) return 0;
        str=str.trim();
        char firstChar = str.charAt(0);
        int sign=1;
        int start =0;
        long res=0;
        if( firstChar == '+' ){
            sign=1;
            start++;
        } else if (firstChar =='-'){
            sign=-1;
            start++;
        }
        for (int i = start; i <str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                return (int) res*sign;
            }
//            System.out.println((int)s.charAt(i)); // 字符串数字和数字之间的差值
            res= res*10 + str.charAt(i) -'0';
            if(sign==1 && res >Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign==-1 && res >Integer.MAX_VALUE) return Integer.MIN_VALUE;

        }
        return (int)res*sign;
    }

    public static void main(String[] args) {
        String s="-91283472332 ";
        System.out.println(myAtoi(s));
    }
}
