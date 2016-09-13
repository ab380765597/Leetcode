public class Solution {
    public boolean isValid(String s) {
        if(s==null||s.length()==0){
            return true;
        }
        int length = s.length();
        if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']'){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        for(int i=1; i<length; i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                if(s.charAt(i)=='}'){
                    if(stack.isEmpty()||stack.pop()!='{'){
                        return false;
                    }
                }
                if(s.charAt(i)==')'){
                    if(stack.isEmpty()||stack.pop()!='('){
                        return false;
                    }
                }
                if(s.charAt(i)==']'){
                    if(stack.isEmpty()||stack.pop()!='['){
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}