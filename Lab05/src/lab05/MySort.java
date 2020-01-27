package lab05;

import java.util.Random;

/**
 *
 * @author Student
 */
public class MySort extends SortZ {

    Random number = new Random();
    int[] copy;
        
    @Override
    protected int losuj(int w_max) {
        return number.nextInt(w_max);
    }

    @Override
    public void wypelnij(int n, int wartosc_maksymalna) {
        tab = new int[n];
        copy = new int[n];
        for(int i=0; i<n; i++) {
            tab[i] = losuj(wartosc_maksymalna);
            copy[i] = tab[i];
        }
    }

    @Override
    public void wypisz() {
       for(int i=0; i<tab.length; i++) {
           System.out.print(tab[i]+" ");
       }
       System.out.println();
    }

    @Override
    public boolean compare(int a, int b, boolean rosnaco) {
        return (b>a&&rosnaco)||(b<a&&!rosnaco);
    }

    @Override
    protected void selectionsort(boolean rosnaco) {
        int i, j, min;
        int tmp;
        for(i=0; i<tab.length; i++) {
            min=i;
            for(j=i; j<tab.length; j++) {
                if(!this.compare(tab[min],tab[j],rosnaco)) {
                    min=j;
                }
            }   
            tmp = tab[i];
            tab[i] = tab[min];
            tab[min] = tmp;
        }
    }

    @Override
    protected void insertsort(boolean rosnaco) {
        int i,j,tmp;
        int n = tab.length;
        for(i=1; i<n; i++) {                     // pobranie kolejnego elementu z nieposortowanej czesci tablicy
        tmp = tab[i];
        j = i-1;
        
        while((j>=0)&&(this.compare(tmp,tab[j],rosnaco)))  // szukanie dla pobranego elementu miejsca w posortowanej czesci tablicy
        {                                                  // (rosnaco) gdy pobrany element jest mniejszy niz element poprzedni, poprzedni przechodzi na nastepne miejsce i kolejna iteracja
            tab[j+1] = tab[j];                             // gdy jest taki sam lub wiekszy koniec petli i wstawienie pobranego elementu w wolne miejsce
            j--;
        }
        tab[j+1] = tmp;
        }
    }
     int licznik =0;
    @Override
    protected void quicksort(int l, int r, boolean rosnaco) {    // zmodyfikowalem parametry dodajac pierwszy i ostatni index tablicy do posortowania
        if(l<r) {
           int i = divideArray(l,r);                      // podzial, oraz przeniesienie elementow mniejszych od i na lewo, a wiekszych na prawo, a nastepnie:
           /* for(int j=l; j<=r; j++)
           {
               System.out.print(tab[j]+" ");
           }  */
           System.out.println();
           quicksort(l, i-1, rosnaco);                    // wywolywanie metody na pierwszej czesci tablicy
           quicksort(i+1, r, rosnaco);                    // nastepnie na drugiej czesci, dopoki ilosc elementow do posortowania jest wieksza niz 1
           
        }
    }
    public int divideArray(int l, int r) {         
        int indexOfDivision = divisionPoint(l,r);                  //  wyznaczenie elementu osiowego
        int valueOfDivision = tab[indexOfDivision];            
        swap(indexOfDivision, r);                                  // zamiana miejscami wyznaczonego osiowego elementu z ostatnim
        
        int currentPosition = l;                                   // aktualna pozycja do wstawienia elementu mniejszego/wiekszego od wyznaczonego
        for(int i=l; i<r; i++) {
            if(this.compare(tab[i], valueOfDivision, true)) {      // gdy biezacy element tablicy wiekszy lub mniejszy od wyznaczonego
                swap(i,currentPosition);                           // to zamiana miejscami ze wskaznikiem currentPosition
                currentPosition++;
            }
        }
        swap(currentPosition, r);                                  // zamiana miejsc elementu osiowego ze wskaznikiem
        return currentPosition;                                    // zwrocenie nowego elementu osiowego
    }
    public int divisionPoint(int l, int r) {
        return (l+r)/2;
    }
    public void swap(int x, int y) {
        int tmp = tab[x];
        tab[x] = tab[y];
        tab[y] = tmp;
    }

    @Override
    protected void countsort(boolean rosnaco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sortuj(boolean rosnaco, SortMethod metoda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
