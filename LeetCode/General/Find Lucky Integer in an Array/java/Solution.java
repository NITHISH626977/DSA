1class Solution {
2    public int findLucky(int[] arr) {
3        List<Integer>list=new ArrayList<>();
4        for(int x:arr){
5            list.add(x);
6        }
7        Set<Integer>set=new HashSet<>(list);
8        int lucky=-1;
9        for(int x:set){
10        int count=Collections.frequency(list,x);
11        if(x==count)
12        lucky=Math.max(lucky,x);
13        }
14return lucky;
15    }
16}