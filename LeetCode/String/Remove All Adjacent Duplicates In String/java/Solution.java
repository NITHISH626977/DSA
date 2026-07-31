class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> Stack =new Stack<>();
        for(char c:s.toCharArray()){
            if(!Stack.isEmpty() && Stack.peek()==c){
                Stack.pop();
            }
            else{
                Stack.push(c);
            }
        }
        StringBuilder res = new StringBuilder();
        for(char c: Stack){
            res.append(c);
        }
        return res.toString();
    }
}