package lab01;

import stos.StackT;

/**
 *
 * @author mateu
 */
public class BracketsCorrectness {

    private StackT stack;
    private String brackets;
    
    public BracketsCorrectness(String brackets) {
        stack = new StackT(brackets.length());
        this.brackets = brackets;
    }
    
    
    public boolean checkBrackets() {
     
     for(int i=0; i<brackets.length(); i++) {
        
        if(brackets.charAt(i)=='(') {
            stack.push(1);
        }
        else if(brackets.charAt(i)==')') {
            if(stack.isEmpty()) {
                return false;
            }
            stack.pop();
            
        }
     }
      return true;
     }
         
}
