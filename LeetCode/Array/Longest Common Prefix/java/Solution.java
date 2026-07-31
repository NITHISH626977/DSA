class Solution {
    public String longestCommonPrefix(String[] strs) {
        String  ans="";
        Arrays.sort(strs);
        String frist=strs[0];
        String last =strs [strs.length-1];
        for(int i=0;i<frist.length();i++){
            if(frist.charAt(i)==last.charAt(i)){
                ans=ans+frist.charAt(i);
            }
            else{
                break;
            }
        }
        return ans;
    }
}