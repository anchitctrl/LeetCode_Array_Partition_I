//Logic which i have used is that the sum can be maximum only when all the other numbers will be maximum too
//and the minimum of a pair can be maximum only if i sort the array and 
//start make pairs in order of 2
//So that the minimum of every pair will be the largest minimum(i know it's funny though) number possible.


class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i=i+2){
            sum=sum+nums[i];
        }
        return sum;
    }
}
