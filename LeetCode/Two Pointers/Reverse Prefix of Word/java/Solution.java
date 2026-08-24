class Solution {
    public String reversePrefix(String word, char ch) {
        String res="";
    for(int i=0;i<word.length();i++){
        char c=word.charAt(i);
            res=c+res;
        if(c==ch){
            return res+word.substring(i+1);
        }
    }
    return word;

    }
}