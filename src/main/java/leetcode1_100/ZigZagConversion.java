package leetcode1_100;

/*
将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。

        比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：

      0  L   C   I   R
      1  E T O E S I I G
      2  E   D   H   N

数学问题

*/

public class ZigZagConversion {
    public static String convert(String s,int numRows){
        if(numRows<=1) return s;
        // 实例一个新的 stringBuilder
        StringBuilder[] sb=new StringBuilder[numRows];

        for (int i =0;i<sb.length;i++){
            sb[i] = new StringBuilder("");
        }
        for (int i=0; i < s.length();i++){
            int index=i%(2*numRows-2);
            index = index<numRows? index:2*numRows-2 -index;
            sb[index].append(s.charAt(i));

            System.out.println(i+ "-" +sb[index].toString());
        }
        for(int i = 1; i<sb.length;i++){
            sb[0].append(sb[i]);
        }
        return sb[0].toString();

    }
    public static void main(String[] args){
        String s= "LEETCODEISHIRING";
        int numRows = 3;
        System.out.println(convert(s,numRows));
//        结果： LCIRETOESIIGEDHN
    }
}
