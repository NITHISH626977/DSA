class Solution {
    public int maximumWealth(int[][] accounts) {
        int cus=0;
        for(int[] i:accounts){
            int sum=0;
        for(int money :i){
            sum+=money;
        }
         if(sum>cus){
            cus=sum;
         } 
        }
        return cus;
    }
}