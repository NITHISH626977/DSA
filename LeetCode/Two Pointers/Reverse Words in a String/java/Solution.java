class Solution {
    public String reverseWords(String s){  
        String[] parts = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i=parts.length-1;i>=0 ;i--){
            res.append(parts[i]);
            if(i!=0) res.append(" ");
        }
        return res.toString();
    }
}