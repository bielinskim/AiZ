package lab01;

import stos.StackL;


public class Lab01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
    //sprawdzenie zadania 4.3
    StackL stos = new StackL();
    System.out.println(stos.isEmpty());
    stos.push(5);
    stos.push(6);
    stos.push(7);
    stos.displayStackContent();                //metoda wypisujaca zawartosc stosu
    System.out.println(stos.isEmpty());
    stos.pop();
    System.out.print(stos.top());
    stos.displayStackContent();               //metoda wypisujaca zawartosc stosu
    
    
    //sprawdzenie zadania 4.4, if true == prawidlowo
    System.out.println("Zad 4.4 - nawiasy");
    BracketsCorrectness test1 = new BracketsCorrectness("))((");
    System.out.println(test1.checkBrackets());
    BracketsCorrectness test2 = new BracketsCorrectness("( (  ))");
    System.out.println(test2.checkBrackets());
    BracketsCorrectness test3 = new BracketsCorrectness("((  )(( ) )");
    System.out.println(test3.checkBrackets());
    BracketsCorrectness test4 = new BracketsCorrectness(")(");
    System.out.println(test4.checkBrackets());
    
    
    //sprawdzenie zadania 4.5
    System.out.println("Zad 4.5 - palindrom");
    Palindrome test5 = new Palindrome("123456");
    System.out.println(test5.checkIfPalindrome());
    Palindrome test6 = new Palindrome("123321");
    System.out.println(test6.checkIfPalindrome());
    Palindrome test7 = new Palindrome("iossoi");
    System.out.println(test7.checkIfPalindrome());
    Palindrome test8 = new Palindrome("iosoi");
    System.out.println(test8.checkIfPalindrome());
  
    
    
    //sprawdzenie zadania 4.6
    ReversePolishNotation test9 = new ReversePolishNotation("2 7 + 3 / 14 3 - 4 * + 2 /");
    test9.read();
    ReversePolishNotation test10 = new ReversePolishNotation("12 2 3 4 * 10 5 / + * +");
    test10.read();
    //ReversePolishNotation test11 = new ReversePolishNotation("2 7 + 3 / 14 3 - 4 * + 2 /");
    //test11.read();
   // ReversePolishNotation test12 = new ReversePolishNotation("2 7 + 3 / 14 3 - 4 * + 2 /");
    //test12.read();
    
    }
    
}
