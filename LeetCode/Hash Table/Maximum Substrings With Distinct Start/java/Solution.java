class Solution {
    public int maxDistinct(String s) {
        HashSet<Character>max= new HashSet<>();
        for(char c : s.toCharArray())max.add(c);
        return max.size();
    }
}