class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>missing= new ArrayList<>();
        boolean[]present=new boolean[nums.length];
        for(int num:nums){
            present[num-1]=true;
        }
        for(int i=0;i<present.length;i++){
            if(!present[i]){
                missing.add(i+1);
            }
        }
        return missing;
    }
}