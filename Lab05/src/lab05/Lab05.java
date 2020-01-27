package lab05;

/**
 *
 * @author bielinskim
 */
public class Lab05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MySort sort = new MySort();
        sort.wypelnij(20,100);
        
        
        //System.out.println(sort.compare(1,2,true));
        //System.out.println(sort.compare(2,1,true));
        //System.out.println(sort.compare(2,2,true));
        //System.out.println(sort.compare(2,1,false));
        //System.out.println(sort.compare(2,2,false));
        /*
        sort.wypisz();
        sort.selectionsort(true);
        sort.wypisz();
        sort.selectionsort(false);
        sort.wypisz();
        
        MySort sort2 = new MySort();
        sort2.wypelnij(20,100);
         sort2.wypisz();
        sort2.insertsort(true);
         sort2.wypisz(); */
         
         MySort sort3 = new MySort();
         sort3.wypelnij(20,100);
         sort3.wypisz();
         sort3.quicksort(0, sort.tab.length-1, false);
         sort3.wypisz();
         sort3.quicksort(0, sort.tab.length-1, true);
         sort3.wypisz();
         
         MySort sort4 = new MySort();
         sort4.wypelnij(10,5);
         sort4.wypisz();
         sort4.countsort(true);
         sort4.countsort(false);
         sort4.wypisz();
         
         //sort4.sortuj(true, SortZ.SortMethod.SELECTION);
    }
    
}
