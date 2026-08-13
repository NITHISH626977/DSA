class Solution {
    public int sumOfUnique(int[] nums) {
      Set<Integer>set=new HashSet<>();
     Set<Integer>set2=new HashSet<>();
     for(int i=0;i<nums.length;i++){
     if(set.contains(nums[i]))
     set2.add(nums[i]);
     else
     set.add(nums[i]);
     }
     int sum=0;
     for(int x:set){
        if(!set2.contains(x))
        sum+=x;
     }
      return sum;
    }
}