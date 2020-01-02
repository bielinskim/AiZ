package lab02;

import aiz.list.ListException;
import aiz.list.ListOne;
import aiz.list.ListTwo;
/**
 * @author bielinskim
 */
public class Lab02 {

    public static void main(String[] args) throws ListException {
       
        
        // ================ Lista jednokierunkowa ================
        
        /* ListOne listOne = new ListOne();
        // indeksowanie pozycji od 0
        System.out.println("=========== metoda addLast ===========");
        listOne.addLast(1);
        listOne.addLast(2); 
        listOne.addLast(3);
        listOne.print();
        System.out.println("=========== metoda addFirst ===========");
        listOne.addFirst("tekst01");
        listOne.addFirst("tekst02");
        listOne.addFirst("tekst03");
        listOne.print();
        System.out.println("=========== metoda addAtPosition ===========");
        listOne.addAtPosition(true, 3);                    
        listOne.addAtPosition(false, 3);
        listOne.addAtPosition(true, 3);
        listOne.print();
        System.out.println("=========== metoda removeFirst ===========");
        System.out.println("Usunięty element: "+listOne.removeFirst());
        listOne.print();
        System.out.println("=========== metoda removeLast ===========");
        System.out.println("Usunięty element: "+listOne.removeLast());
        listOne.print();
        System.out.println("=========== metoda remove ===========");
        System.out.println("Usunięty element z pozycji 3: "+listOne.remove(3));
        listOne.print();
        System.out.println("=========== metoda remove ===========");
        System.out.println("Usunięty element z pozycji 3: "+listOne.remove(3));
        listOne.print();
        System.out.println("=========== metoda contains ===========");
        listOne.print();
        System.out.println("Wyszukanie elementu: tekst01: "+listOne.contains("tekst01"));
        System.out.println("Wyszukanie elementu: tekst03: "+listOne.contains("tekst03"));
        System.out.println("=========== metoda find ===========");
        listOne.print();
        System.out.println("Wyszukanie elementu: tekst01, indeks: "+listOne.find("tekst01"));
        System.out.println("Wyszukanie elementu: tekst03, indeks: "+listOne.find("tekst03")); */
        
        
        // ================ Lista dwukierunkowa ================
        
        ListTwo listTwo = new ListTwo();
        // indeksowanie pozycji od 0
        System.out.println("=========== metoda addLast ===========");
        listTwo.addLast(1);
        listTwo.addLast(2); 
        listTwo.addLast(3);
        listTwo.print();
        System.out.println("=========== metoda addFirst ===========");
        listTwo.addFirst("tekst01");
        listTwo.addFirst("tekst02");
        listTwo.addFirst("tekst03");
        listTwo.print();
        System.out.println("=========== metoda addAtPosition ===========");
        listTwo.addAtPosition(true, 3);                    
        listTwo.addAtPosition(false, 3);
        listTwo.addAtPosition(true, 3);
        listTwo.print();
        System.out.println("=========== metoda removeFirst ===========");
        System.out.println("Usunięty element: "+listTwo.removeFirst());
        listTwo.print();
        System.out.println("=========== metoda removeLast ===========");
        System.out.println("Usunięty element: "+listTwo.removeLast());
        listTwo.print(); 
        System.out.println("=========== metoda remove ===========");
        System.out.println("Usunięty element z pozycji 3: "+listTwo.remove(3));
        listTwo.print();
        System.out.println("=========== metoda remove ===========");
        System.out.println("Usunięty element z pozycji 3: "+listTwo.remove(3));
        listTwo.print();
        System.out.println("=========== metoda contains ===========");
        listTwo.print();
        System.out.println("Wyszukanie elementu: tekst01: "+listTwo.contains("tekst01"));
        System.out.println("Wyszukanie elementu: tekst03: "+listTwo.contains("tekst03"));
        System.out.println("=========== metoda find ===========");
        listTwo.print();
        System.out.println("Wyszukanie elementu: tekst01, indeks: "+listTwo.find("tekst01"));
        System.out.println("Wyszukanie elementu: tekst03, indeks: "+listTwo.find("tekst03"));
       
    }
    
}
