class Solution {
    public int countWords(String[] words1, String[] words2) {
        int b=0;
        for(int i=0;i<words1.length;i++){
            int c=0;
            int d=0;
            for(int j=0;j<words1.length;j++){
                if(words1[i].equals(words1[j])){
                    c++;
                }
            }
            for(int j=0;j<words2.length;j++){
                if(words1[i].equals(words2[j])){
                    d++;
                }
            }
            if(c==1 && d==1){
                b++;
            }

        }
        return b;
    }
}