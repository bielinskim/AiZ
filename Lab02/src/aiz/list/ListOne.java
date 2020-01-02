/**
 * @author bielinskim
 */
package aiz.list;


public class ListOne<T> implements IList<T> {

    private ElemOne<T> firstElement, lastElement, elementP, elementC, elementF, elementRL, elementR, elementS, elementA;
 
    @Override
    public void addFirst(T newData) {
        ElemOne<T> oldFirst;
        if(firstElement!=null) {
            oldFirst = firstElement;                          // referencja do poprzedniego pierwszego elementu w OldFirst
            firstElement = new ElemOne(newData, oldFirst);     // nowy pierwszy element
        }
        else {
           firstElement = new ElemOne(null);                 // dodanie pierwszego elementu
           firstElement.setData(newData);
           lastElement = firstElement;
        }
    }
    @Override
    public void addLast(T newData) {
       
       if(firstElement!=null) {                               //sprawdzenie czy lista nie jest pusta
       lastElement.setNext(new ElemOne(newData, null));       //utworzenie nastepnego elementu z podanymi danymi
       lastElement = lastElement.getNext();                   //podmiana referencji do ostatniego elementu
       }
       else {
           firstElement = new ElemOne(null);                 // dodanie pierwszego elementu
           firstElement.setData(newData);
           lastElement = firstElement;
       }
       
    }

    @Override
    public void addAtPosition(T newData, int position) throws ListException {
        elementA=firstElement;
        ElemOne<T> first, third;
        if(position<=this.size()&&position>=0) {                                               
        if(position==0) {this.addFirst(newData);}
        else if(position==this.size()) {this.addLast(newData);}
        else {
        for(int i=0; i<=position-2; i++) {                               // uzyskanie elementu przed podana pozycja
             elementA = elementA.getNext();
        }
          first = elementA;
          third = elementA.getNext();
          first.setNext(new ElemOne(newData, third));

        }}
        else {
            throw new ListException("Niepoprawna pozycja");
        }
    }

    @Override
    public int size() {
        elementS=firstElement;
       
        if(elementS!=null) {                               
       
        if(elementS.getNext()==null) {                    
           return 1;                  
        }
        else {
            int size = 1;
            while(elementS.getNext()!=null) {             // szukanie przedostatniego elementu
                 size++;
                 elementS = elementS.getNext();
        }
        return size;
        }}
        else {
          return 0; 
        }   
        
    }

    @Override
    public T removeFirst() throws ListException {
        ElemOne<T> newFirstElement;
        T dataOfFirstElement;
        if(firstElement!=null) {   
        if(firstElement.getNext()==null) {
            dataOfFirstElement = firstElement.getData();       // jesli jeden element, pobranie danych, usuniecie referencji do pierwszego elementu
            firstElement = null;
        }
        else {
            dataOfFirstElement = firstElement.getData();       // jesli wiecej, pobranie danych pierwszego elementu, oraz zastapienie pierwszego nastepnym
            newFirstElement = firstElement.getNext(); 
            firstElement = newFirstElement;
            
        }
        return dataOfFirstElement;
        }
        else {
            throw new ListException("Lista jest pusta");
        }   
    }

    @Override
    public T removeLast() throws ListException {
        elementRL=firstElement;
        T oldLastElement;
        ElemOne<T> oneBeforeLastElement = elementRL;
        if(elementRL!=null) {                               // sprawdzanie czy lista nie jest pusta
        oldLastElement = lastElement.getData();
        if(elementRL.getNext()==null) {                     // jesli jest jeden element
            firstElement = null;                        
        }
        else {
             while(elementRL.getNext()!=null) {             // szukanie przedostatniego elementu
                 oneBeforeLastElement = elementRL;
                 elementRL = elementRL.getNext();
        }
        oneBeforeLastElement.setNext(null);               // zamiana przedostatniego na ostatni
        lastElement = oneBeforeLastElement;
        }}
        else {
            throw new ListException("Lista jest pusta");
        }   
        return oldLastElement;
  
    }

    @Override
    public T remove(int position) throws ListException {
        elementR=firstElement;
        T returnElem;
        ElemOne<T> first, second, third;
        if(position<=this.size()&&position>=0) {                                               
        if(position==0) {returnElem = this.removeFirst();}
        else if(position==this.size()) {returnElem = this.removeLast();}
        else {
        for(int i=0; i<=position-2; i++) {                               // uzyskanie elementu przed podana pozycja
             elementR = elementR.getNext();
        }
          first = elementR;                                             // powiazanie elementu pos-1 z elementem pos+1, oraz zwrocenie danych elementu pos
          second = elementR.getNext();
          third = second.getNext();
          first.setNext(third);
          returnElem = second.getData();

        }}
        else {
            throw new ListException("Niepoprawna pozycja");
        }
        return returnElem;
    }

    @Override
    public int find(T dataToFind) {
       elementF = firstElement;
       int indexOfElement =0;
       if(elementF!=null) {
       while(elementF!=null) {
            if(elementF.getData()==dataToFind) { return indexOfElement; }
            indexOfElement++;
            elementF = elementF.getNext();
        }
       }
       return -1;
    }

    @Override
    public boolean contains(T data) {
       elementC = firstElement;
       if(elementC!=null) {
       while(elementC!=null) {
            if(elementC.getData()==data) { return true; }
            elementC = elementC.getNext();
        }
       }
       return false;
    }

    @Override
    public void print() {
       elementP = firstElement;
       if(elementP!=null) {
       while(elementP!=null) {
            System.out.println(elementP.getData());
            elementP = elementP.getNext();
        }
       }
    }


}
