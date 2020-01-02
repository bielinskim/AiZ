package lab02;

import aiz.list.ListException;
import aiz.list.ListOne;
/**
 * @author bielinskim
 */
public class Lab02 {

    public static void main(String[] args) throws ListException {
       
        ListOne list = new ListOne();
        // indeksowanie pozycji od 0
        System.out.println("=========== metoda addLast ===========");
        list.addLast(1);
        list.addLast(2); 
        list.addLast(3);
        list.print();
        System.out.println("=========== metoda addFirst ===========");
        list.addFirst("tekst01");
        list.addFirst("tekst02");
        list.addFirst("tekst03");
        list.print();
        System.out.println("=========== metoda addAtPosition ===========");
        list.addAtPosition(true, 3);                    
        list.addAtPosition(false, 3);
        list.addAtPosition(true, 3);
        list.print();
        System.out.println("=========== metoda removeFirst ===========");
        System.out.println("Usunięty element: "+list.removeFirst());
        list.print();
        System.out.println("=========== metoda removeLast ===========");
        System.out.println("Usunięty element: "+list.removeLast());
        list.print();
        System.out.println("=========== metoda remove ===========");
        System.out.println("Usunięty element z pozycji 3: "+list.remove(3));
        list.print();
        System.out.println("=========== metoda remove ===========");
        System.out.println("Usunięty element z pozycji 3: "+list.remove(3));
        list.print();
        System.out.println("=========== metoda contains ===========");
        list.print();
        System.out.println("Wyszukanie elementu: tekst01: "+list.contains("tekst01"));
        System.out.println("Wyszukanie elementu: tekst03: "+list.contains("tekst03"));
        System.out.println("=========== metoda find ===========");
        list.print();
        System.out.println("Wyszukanie elementu: tekst01, indeks: "+list.find("tekst01"));
        System.out.println("Wyszukanie elementu: tekst03, indeks: "+list.find("tekst03"));
        
    }
    
}
