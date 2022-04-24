package myfirst.src.com.imooc;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
    public int[] plusOne(int[] digits) {
        int[] newDigits;
        if(digits[digits.length-1] < 9){
            digits[digits.length-1] += 1;
            newDigits = digits;
        }else{
            long digit = 0;
            //数组转整数
            for(int i = 0 ; i < digits.length; i++){
                digit += digits[i] * Math.pow(10,digits.length - 1 - i);
            }
            digit += 1;
            System.out.println(digit);
            String digit1 = String.valueOf(digit);
            System.out.println(digit1);

            newDigits = new int[digit1.length()];
            for(int i = 0 ; i < digit1.length();i++){
                newDigits[i] = Integer.parseInt(String.valueOf(digit1.charAt(i)));
            }
        }
        return newDigits;

    }

    /**
     * 旋转数组
     * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
     * @param
     * @param
     */
    public void rotate(int[] nums, int k) {
        // 7
        int a;
        int len = nums.length;
        for(int i = 0 ; i < k ; i++){
            a = nums[len - 1];
            System.out.println(a);
            for(int j = len - 1 ; j > 0 ; j--){
                nums[j] = nums[j-1];
            }
            nums[0] = a;

        }
    }

    /**
     * 存在重复元素
     * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        String str = Arrays.toString(nums);
        System.out.println(str.length());
        for(int i = 0; i < str.length()-1 ; i++){
            if( str.indexOf(str.charAt(i),i+1) > 0){
                System.out.println(i);
                System.out.println(str.lastIndexOf(str.charAt(i)));
                System.out.println(str.charAt(str.lastIndexOf(str.charAt(i))));
                return true;
            }
        }
        return false;
    }

    /**
     * 只出现一次的数字
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int reduce = 0;
        for (int num : nums) {
            reduce =  reduce ^ num;
        }
        return reduce;
    }

    /**
     * 移动零
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int lastIndex = nums.length - 1;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] == 0){
                //int a = nums[zeroIndex];
                for(int j = i ; j < nums.length - 1 ; j++){
                    nums[j] = nums[j+1];
                }
                nums[lastIndex] = 0;
                if(i == 0){
                    i = 0;
                }else{
                    i -= 1;
                }
            }
        }
    }


    public static void main(String[] args) {
        Solution solu = new Solution();
        //System.out.println(solu.plusOne(new int[]{5, 6, 2, 0, 0, 4, 6, 2, 4, 9}));
        //solu.rotate(new int[]{1,2,3,4,5,6,7},3);
        //boolean b = solu.containsDuplicate(new int[]{1,2,3,1});
        //int a = solu.singleNumber(new int[]{4,1,2,1,2});
        solu.moveZeroes(new int[]{0,1,0,3,12});
    }
}