class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int m=Integer.MAX_VALUE;
        int temp;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<m){
                m=prices[i];
            }
            temp=prices[i]-m;
            if(ans<temp){
                ans=temp;
            }
        }
        return ans;
    }
}