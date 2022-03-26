package stack.and.queue.queue.structure;

import java.util.Stack;

public class ValidateBrackets {
    public boolean ValidateBrackets(String value){
        Stack<Character> stack=new Stack<Character>();
           char p ;
        for (int i = 0; i <value.length() ; i++) {
            p=value.charAt(i);

            if (p=='{'){
return false;
            }
            if (p=='['){
                return false;
            }
            if (p=='('){
stack.push(p);
            }
            if (p=='{'){
                   stack.push(p);
                     if (p=='}')
                         if (stack.empty())return false;
                     else if (stack.peek()=='{')stack.pop();

            }
           else if (p==')'){
               if (stack.empty())return false;

                  else if (stack.peek()=='(')stack.pop();

                  else return false;

            }
            if (p=='['){
                stack.push(p);
                if (p==']')
                    if (stack.empty())return false;
                    else if (stack.peek()=='[')stack.pop();

            }

        }






        return stack.empty();


    }




}
