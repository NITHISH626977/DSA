class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]=new int[2];
        int ind =0;
        Set<Integer> set= new HashSet<>();
        for(int num: nums){
            if(!set.add(num)) arr[ind++]=num;
        }
         return arr;
    }
}