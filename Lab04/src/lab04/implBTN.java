package lab04;

import java.util.Scanner;

/**
 *
 * @author bielinskim
 */
public class implBTN extends BTN {

    
    public implBTN(int dane) {
        super(dane);
    }
    

    public int getDane() {
        return dane;
    }

    public BTN getLewy() {
        return lewy;
    }

    public BTN getPrawy() {
        return prawy;
    }

    public void setDane(int dane) {
        this.dane = dane;
    }

    public void setLewy(BTN lewy) {
        this.lewy = lewy;
    }

    public void setPrawy(BTN prawy) {
        this.prawy = prawy;
    }
    
    @Override
    public void print(int poziom) {
        if(lewy!=null) {
            lewy.print(poziom+1);
        }
        for(int i=0; i<poziom; i++) {
            System.out.print("    ");
        }
        System.out.println(dane);
        if(prawy!=null) {
            prawy.print(poziom+1);
        }
    }
    @Override
    public void readTree() {
        Scanner dataInput = new Scanner(System.in);                      // zasada podobna jak w przypadku metody print()
        char choice;                                                     // koniec tworzenia drzewa nastapi, gdy uzytkownik odrzuci mozliwosc stworzenia 
        System.out.println("Jestes w wezle: "+dane);                     // lewego i prawego poddrzewa dla kazdego naddrzewa
        if(lewy==null) {                                                 // pierwszy wezel utworzony w konstruktorze
            System.out.println("Czy utworzyc lewe poddrzewo? (T/N)");
            choice = dataInput.next().charAt(0);
            if(choice=='t'||choice=='T') {
                System.out.println("Podaj wartosc ");
                lewy = new implBTN(dataInput.nextInt());
                lewy.readTree();
            }
        }
        System.out.println("Jestes w wezle: "+dane);
        if(prawy==null) {
            System.out.println("Czy utworzyc prawe poddrzewo? (T/N)");
            choice = dataInput.next().charAt(0);
            if(choice=='t'||choice=='T') {
                System.out.println("Podaj wartosc ");
                prawy = new implBTN(dataInput.nextInt());
                prawy.readTree();
            }
        }
    }


    @Override
    public void printPre() {
        System.out.print(dane+" ");                
        if(lewy!=null) {
            lewy.printPre();
        }
        if(prawy!=null) {
            prawy.printPre();
        }
    }

    @Override
    public void printIn() {         
        if(lewy!=null) {
            lewy.printIn();
        }
        System.out.print(dane+" ");     
        if(prawy!=null) {
            prawy.printIn();
        }
    }

    @Override
    public void printPost() {
        if(lewy!=null) {
            lewy.printPost();
        } 
        if(prawy!=null) {
            prawy.printPost();
        }
        System.out.print(dane+" ");    
    }

    @Override
    public boolean searchBSTRec(int szukany) { 
        if(dane==szukany) {
            return true;
        }
        if(szukany>dane&&prawy!=null) {    
             return prawy.searchBSTRec(szukany);
        }
        if(szukany<dane&&lewy!=null) {
              return lewy.searchBSTRec(szukany);
        }
        return false;
    }
    @Override
    public void addBSTRec(int nowy) {
        if(nowy>dane) {    
            if(prawy!=null) {
                prawy.addBSTRec(nowy);
            }
            else {
                prawy = new implBTN(nowy);
            }
        }
        if(nowy<dane) {
            if(lewy!=null) {
                lewy.addBSTRec(nowy);
            }
            else {
                lewy = new implBTN(nowy);
            }
        }
    }

    @Override
     public Pair<BTN, BTN> searchBST(int szukany) {
        BTN current = this;
        BTN parent = null;
         while(current!=null&&current.dane!=szukany) {
            parent=current;
            if(szukany>current.dane) {
                current = current.prawy;
            }
            else if(szukany<current.dane) {
                current = current.lewy;
            }
        }
        if(current==null) {
            return new Pair(new implBTN(0), parent);              // 0, bo NullPointerException
        }
        if(parent==null) {
            return new Pair(current, new implBTN(0));  
        }
        return new Pair(current, parent);

    } 
    
}
