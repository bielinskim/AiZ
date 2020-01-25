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
        implBTN root = new implBTN(8);
        root.lewy=new implBTN(3);
        root.lewy.lewy = new implBTN(1);
        root.lewy.prawy = new implBTN(6);
        root.lewy.prawy.lewy = new implBTN(4);
        root.lewy.prawy.prawy = new implBTN(7);
        
        root.prawy = new implBTN(10);
        root.prawy.prawy = new implBTN(14);
        root.prawy.prawy.lewy = new implBTN(13);
        
        //             8 
        //      3              10
        //   1     6              14
        //       4             13
        
        root.print(0);
        root.printPre();
        System.out.println();
        
         //implBTN newBinaryTree = new implBTN(0);
         //newBinaryTree.readTree();
         //newBinaryTree.print(0);
        
         //System.out.println(root.searchBSTRec(15));
         
         root.addBSTRec(5);
         root.print(0);
    }
    
}
