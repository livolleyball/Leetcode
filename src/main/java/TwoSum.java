import java.util.HashMap;

public class TwoSum {
/*
 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

    你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

    time:O(n)
    space:O(n)

    */


    public static int[] twoSum(int[] nums,int target){
        // 判断边界条件
        if (nums == null || nums.length<2){
            return new int[]{-1,-1};
        };
        int[] res=new int[]{-1,-1};
        HashMap<Integer,Integer> map =new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++){
            System.out.println(map);
            if (map.containsKey(target-nums[i])){
                res[0]=map.get(target-nums[i]);
                res[1]=i;
            }
            map.put(nums[i],i);
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums={2,7,11,15};
        int target =9;
        for (int i:twoSum(nums,target)){
            System.out.println(i);
        }

    }
}
