package stos;
/**
 *
 * @author mateu
 */
public class StackL implements IStack {

    SElem newElement;
    SElem oldElement;
    SElem displayElement;
    SElem popElement;
    int stackLength;
    int element = 0;
    
    public StackL() {
        oldElement = new SElem();    // zawsze musi byc oldElement
        stackLength = 0;
    }
    @Override
    public void push(int dane) {
        
        newElement = new SElem();         // utowrzenie nowego elementu stosu > ustawienie poprzedniego elementu jako "under" w nowym elemencie >
        newElement.setUnder(oldElement);  //  ustawienie danych nowego elementu > zastepienie poprzedniego elementu nowym(przygotowanie do nastepnego wywolania metody) > inkrementacja dlugosci stosu
        newElement.setData(dane);
        oldElement = newElement;
        stackLength++;
    }

    @Override
    public void pop() {
     if(stackLength>0) {
     popElement = oldElement.getUnder();
     oldElement = popElement;
     stackLength--;
     }
     else {
         System.err.println("Stack is empty");
     }
    }

    @Override
    public int top() {
       return oldElement.getData();
    }

    @Override
    public boolean isEmpty() {
       if(stackLength == 0) {return true;}
       else {return false;}
    }
    public void displayStackContent() {
    
    int stackLengthDisplay = stackLength;
    element = oldElement.getData();
    if(0 == stackLengthDisplay) {
        System.out.println("Stos pusty");
    }
    else {
        displayElement = oldElement;
        while(stackLengthDisplay !=0) {
          System.out.println(element);
          displayElement = displayElement.getUnder();
          element = displayElement.getData();
          stackLengthDisplay--;
    } 
    }
}
}
