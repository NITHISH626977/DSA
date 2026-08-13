class Solution {
    public int findLucky(int[] arr) {
        List<Integer>list=new ArrayList<>();
        for(int x:arr){
            list.add(x);
        }
        Set<Integer>set=new HashSet<>(list);
        int lucky=-1;
        for(int x:set){
        int count=Collections.frequency(list,x);
        if(x==count)
        lucky=Math.max(lucky,x);
        }
return lucky;
    }
}