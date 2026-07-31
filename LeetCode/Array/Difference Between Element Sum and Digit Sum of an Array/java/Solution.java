class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int s=0;
        for(int n:nums){
            int num=n;
            sum+=n;
        while(n!=0){
            s=s+n%10;
            n=n/10;
        }
        }
      return Math.abs(sum-s);  
    }
}