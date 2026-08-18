class Solution {
    public String clearDigits(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
        if(Character.isLetter(ch)){
            res+=ch;
        }
        else{
            res=res.substring(0,res.length()-1);
        }
        }
        return res;
    }
}