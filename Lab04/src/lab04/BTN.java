package lab04;
/**
 * Klasa reprezentujaca wezel drzewa binarnego.
 */
public abstract class BTN {
    
    /** Wartosc przechowywana w wezle.
     */
    protected int dane;
    /**
     * Lewe i prawe poddrzewo.
     */
    protected BTN lewy, prawy;

    /**
     * Konstruktor. 
     * @param dane 
     */
    public BTN(int dane) {
        this.dane = dane;
    }
    
/** Wypisuje drzewo. 
 * Np. dla drzewa
        8
    3       5
 2    1  4    0 
 wypisac:
        2
     3
        1
  8
        4
     5
        0
* 
* pseudokod metody:
* 
jesli jest lewe poddrzewo, to wypisz lewe (wolanie rekurencyjne)
wypisz odstepy (w zaleznosci od poziomu), wypisz dane, przejdz do nowego wiersza
jesli jest prawe, to wypisz prawe (wolanie rekurencyjne)
* 
     * @param poziom odleglosc wezla od korzenia. Zaczynamy od 0.
 */
    public abstract void print(int poziom);
	
/** Wczytuje drzewo z klawiatury.
Po uruchomieniu mamy np.:
Podaj wartosc:
5
Jestes w wezle 5.
Czy utworzyc lewe poddrzewo (T/N) ?
T
.....
Jestes w wezle 5.
Czy utworzyc prawe poddrzewo (T/N) ?
itd.
  */
    public abstract void readTree();
    
/**wypisuje wezly w kolejnosci pre-order
*/
    public abstract void printPre();
    
/**
wypisuje wezly w kolejnosci In-order
*/
    public abstract void printIn();
    
/** wypisuje wezly w kolejnosci post-order
*/
    public abstract void printPost();
       
  
/** Rekurencyjne przeszukuje drzewo BST.
 * Zwraca true, jesli znajdzie element o podanej wartosci .
     * @param szukany poszukiwana wartosc
     * @return true, jesli podana wartosc jest w drzewie, false w przeciwnym wypadku
 */
    public abstract boolean searchBSTRec(int szukany);
    
/**
 * Rekurencyjnie dodaje element do drzewa BST.
     * @param nowy dane do przechowywania w nowym wezle
 */ 
    public abstract void addBSTRec(int nowy);
    
/** Itercyjne wyszukiwanie wartosci w drzewie BST.
 * Zwraca pare: wezel zawierajacy poszukiwany element oraz jego poprzednika.
Jesli szukanego elementu nie ma w drzewie, to pierwszym elementem pary jest null.
Jesli pierwszy element pary jest korzeniem (nie ma poprzednika), to drugim elementem pary jest null.  
     * @param szukany poszukiwana wartosc
     * @return para wezlow: pierwszy to wezel zawierajacy szukana wartosc lub null, jesli nie znaleziono;
     * drugi element pary to rodzic wezla (lub null, jesli szukana wartosc jest w korzeniu drzewa)
*/
    public abstract Pair < BTN, BTN > searchBST(int szukany);    
    
 
}



