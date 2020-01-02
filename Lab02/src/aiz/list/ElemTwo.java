package aiz.list;

/**
 * Element generycznej listy dwukierunkowej.
 */
public class ElemTwo<T> {
    private T data;
    private ElemTwo prev, next;

    public ElemTwo(T data) {
        this.data = data;
    }

    public ElemTwo(ElemTwo prev, T data, ElemTwo next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
   
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ElemTwo getNext() {
        return next;
    }

    public void setNext(ElemTwo next) {
        this.next = next;
    }

    public ElemTwo getPrev() {
        return prev;
    }

    public void setPrev(ElemTwo prev) {
        this.prev = prev;
    }
    
}
