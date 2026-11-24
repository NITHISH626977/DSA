class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int count=0;
        for(int i=0;i<ransomNote.length();i++){
            boolean found=false;
            for(int j=0;j<magazine.length();j++){
                if(ransomNote.charAt(i)==magazine.charAt(j)){
                count++;
                magazine=magazine.substring(0,j)+magazine.substring(j+1);
                 found=true;
                 break;
                }
            }
            if(!found){
                 return false;
            }
        }
        return true;
    }
}