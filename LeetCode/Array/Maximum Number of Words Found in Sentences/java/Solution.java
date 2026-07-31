class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        int maxCount=0;
        for( int i=0;i<sentences.length;i++){
             count=sentences[i].split(" ").length;
             maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}