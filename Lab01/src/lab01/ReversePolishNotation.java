package lab01;

import java.util.Scanner;
import stos.StackT;

/**
 *
 * @author mateu
 */
public class ReversePolishNotation {
    
    public String expression;
    public String element;
    
    
    public ReversePolishNotation(String expression) {
        
        this.expression = expression;
    }
    
    public void read() {
        int a;
        int b;
        int result;
        Scanner readExpression = new Scanner(expression);
        StackT stack = new StackT(expression.length());
        while(readExpression.hasNext()) {
            element = readExpression.next();
            if("+".equals(element)) {
                 a = stack.top();
                 stack.pop();
                 b = stack.top();
                 stack.pop();
                 stack.push(b+a);
            }
            else if("-".equals(element)) {
                  a = stack.top();
                 stack.pop();
                 b = stack.top();
                 stack.pop();
                 stack.push(b-a);
            }
            else if("*".equals(element)) {
                 a = stack.top();
                 stack.pop();
                 b = stack.top();
                 stack.pop();
                 stack.push(b*a);
            }
            else if("/".equals(element)) {
                 a = stack.top();
                 stack.pop();
                 b = stack.top();
                 stack.pop();
                 stack.push(b/a);
            }
            else {
                stack.push(Integer.parseInt(element));
            }
        }
        System.out.println(stack.top());
        readExpression.close();
    }
    public void convertToRPN() {
        Scanner convertExpression = new Scanner(expression);
        StackT stack = new StackT(expression.length());
        while(convertExpression.hasNext()) {
            element = convertExpression.next();
            stack.push(Integer.parseInt(element));
            if(")".equals(element)) {
                
            }
        }
    }
    public static boolean isNumeric(String strNum) {
    try {
        int d = Integer.parseInt(strNum);
    } catch (NumberFormatException | NullPointerException nfe) {
        return false;
    }
    return true;
}
}
   