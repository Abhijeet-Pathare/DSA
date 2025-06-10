import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        //   if(s.length()==1) return false;

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty() ||
                        (c==')' && stack.peek() != '(') ||
                        (c=='}' && stack.peek() != '{') ||
                        (c == ']' && stack.peek() != '[')){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}