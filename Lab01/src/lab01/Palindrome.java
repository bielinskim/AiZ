package lab01;

import stos.StackT;

/**
 *
 * @author mateu
 */
public class Palindrome {
    
    private String word;
    private StackT stack;
    
    public Palindrome(String word) {
        
        this.word = word;
        stack = new StackT(word.length());
    }
    public boolean checkIfPalindrome() {
        
        int j;
        for(int i=0; i<word.length()/2; i++) {
           
                stack.push(word.charAt(i));
  
        } 
        j = word.length()/2;
        if(word.length()%2==1) {
            j+=1;

        }

        for(j=j; j<word.length(); j++) {
           if(word.charAt(j)!=stack.top()) {
               System.out.println(stack.top()+"  "+word.charAt(j));
               return false;
           }
           stack.pop();
        }
        return true;
    }
}
