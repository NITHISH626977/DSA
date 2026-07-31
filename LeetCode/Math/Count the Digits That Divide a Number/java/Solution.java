class Solution {
    public int countDigits(int n) {
        int c=0;
        int num=n;
        while(n>0){
            int val=n%10;
            if(num%val==0){
                c++;
            }
            n/=10;
        }
        return c;
    }
}