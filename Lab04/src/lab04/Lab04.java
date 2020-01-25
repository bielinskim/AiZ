package lab04;

/**
 *
 * @author bielinskim
 */
public class Lab04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        implBTN root = new implBTN(7);
        root.lewy=new implBTN(0);
        root.lewy.lewy = new implBTN(5);
        root.lewy.prawy = new implBTN(10);
        root.lewy.prawy.lewy = new implBTN(2);
        
        root.prawy = new implBTN(12);
        root.prawy.prawy = new implBTN(7);
        root.prawy.lewy = new implBTN(1);
        
        //             7 
        //      0              12
        //   5     10        1     7
        //       2
        
        root.print(0);
        root.printPre();
        
         implBTN newBinaryTree = new implBTN(0);
         newBinaryTree.readTree();
         newBinaryTree.print(0);
        
    }
    
}
