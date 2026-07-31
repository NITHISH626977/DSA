class Solution {
    public int fib(int n) {
               if(n==0)
        return 0;
        int a=0;
        int b=1;

        while(n>1){
           int temp=b;
            b=a+b;
            a=temp;
            n--;
        }
       return b;
    }
}