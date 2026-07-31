class Solution {
    public int findNumbers(int[] nums) {
        int res=0;
        for(int num:nums){
            int cnt =0;
              while (num != 0){
                cnt++;
                num/=10;
              }
              res+=(cnt%2==0)? 1:0;
       
        }
        return res ;

    }
}