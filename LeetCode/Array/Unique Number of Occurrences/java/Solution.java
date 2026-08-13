class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        List<Integer>list=new ArrayList<>();
        for(int x:arr){
            list.add(x);
        }
        Set<Integer>set=new HashSet<>(list);
        Set<Integer>set2=new HashSet<>();
        int count=0;
        for(int a:set){
          count=Collections.frequency(list,a);
            if(set2.contains(count)){
            return false;
            }
            set2.add(count);
        }
        return true;
    }
}