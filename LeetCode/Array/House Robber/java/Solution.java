class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int max=0,sum=0;
        for(int num:nums){
            int cur=Math.max(max,sum + num);
            sum=max;
            max=cur;
        }
        return max;        
    }
}