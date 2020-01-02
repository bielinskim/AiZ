package aiz.list;


public class ListTwo<T> implements IList<T>  {

    private ElemTwo<T> firstElement, lastElement;
    
    @Override
    public void addFirst(T newData) {
        if(firstElement!=null) {
            firstElement.setPrev(new ElemTwo(null, newData, firstElement));
            firstElement = firstElement.getPrev();
        }
        else {
            firstElement = new ElemTwo(newData);
            lastElement = firstElement;
        }
    }

    @Override
    public void addLast(T newData) {
        if(firstElement!=null) {
            lastElement.setNext(new ElemTwo(lastElement, newData, null));
            lastElement = lastElement.getNext();
        }
        else {
            firstElement = new ElemTwo(newData);
            lastElement = firstElement;
        }
    }

    @Override
    public void addAtPosition(T newData, int position) throws ListException {
        ElemTwo<T> element = firstElement;
        ElemTwo<T> prev, next;
        int size = this.size();
        if(position<=size  && position>=0) {
        if(position==0) {this.addFirst(newData);}
        else if(position==size) {this.addLast(newData);}
        else {
            for(int i=0; i<=position-2; i++) {
                element = element.getNext();
            }
            prev = element;
            next = element.getNext();
            prev.setNext(new ElemTwo(prev, newData, next));
        }
        }
        else {throw new ListException("Niepoprawna pozycja");}
    }

    @Override
    public int size() {
        ElemTwo<T> element = firstElement;
        if(element!=null) {
            int size = 0;
            while(element!=null) {
                size++;
                element = element.getNext();
            }
            return size;
        }
        else {
            return 0;
        }
    }

    @Override
    public T removeFirst() throws ListException {
        T data;
        if(firstElement!=null) {
        if(firstElement.getNext()==null) {
            data = firstElement.getData();
            firstElement = null;
        }
        else {
            data = firstElement.getData();
            firstElement = firstElement.getNext();
        }            
        }
        else {
            throw new ListException("Lista jest pusta");
        }
        return data;
    }

    @Override
    public T removeLast() throws ListException {
        ElemTwo<T> element;
        T data;
        if(firstElement!=null) {
        if(firstElement.getNext()==null) {
            data = firstElement.getData();
            firstElement = null;
        }
        else {
            data = lastElement.getData();
            element = lastElement.getPrev();
            element.setNext(null);
            lastElement = element;
        }
        }
        else {
            throw new ListException("Lista jest pusta");
        }
        return data;
    }

    @Override
    public T remove(int position) throws ListException {
        ElemTwo<T> element = firstElement;
        ElemTwo<T> first, second, third;
        T data;
        int size = this.size();
        if(position<=size && position>=0) {
        if(position==0) {data = this.removeFirst();}
        else if(position==size) {data = this.removeLast();}
        else {
            for(int i=0; i<=position-2; i++) {
                element = element.getNext();
            }
            first = element;
            second = element.getNext();
            third = second.getNext();
            first.setNext(third);
            data = second.getData();
        }
        }
        else {
            throw new ListException("Niepoprawna pozycja");
        }
        return data;
    }

    @Override
    public int find(T dataToFind) {
        ElemTwo<T> element = firstElement;
        int indexOfElement = 0;
        if(element!=null) {
          while(element!=null) {
           if(dataToFind==element.getData()) {return indexOfElement;};  
           indexOfElement++;
           element = element.getNext();
           }   
        }
        return -1;
    }

    @Override
    public boolean contains(T data) {
       ElemTwo<T> element = firstElement;
       if(element!=null) {
       while(element!=null) {
            if(element.getData()==data) { return true; }
            element = element.getNext();
        }
       }
       return false;
    }

    @Override
    public void print() {
       ElemTwo<T> element = firstElement;
        if(element!=null) {
            while(element!=null) {
                System.out.println(element.getData());
                element = element.getNext();
                
            }
        }
    }
    
}
