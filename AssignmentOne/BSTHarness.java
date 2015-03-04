import java.util.Scanner;
/**
 * Asks the user to input a sequence of integers, constructs a SimpleBST from them, and prints
 * it out.
 * 
 * @author Stephan Jamieson 
 * @version 25/2/2015
 */
public class BSTHarness {


    public static void main(String [] args) {
        System.out.print("Enter a comma separated sequence of node values: ");
        Scanner scanner = new Scanner(System.in);
        scanner = new Scanner(scanner.nextLine()).useDelimiter("\\s*,\\s*");

        SimpleBST tree1 = new  SimpleBST();
        
        while (scanner.hasNextInt() ){
            tree1.insert(scanner.nextInt());
        }
        
//        Scanner scan = new Scanner(System.in);
//        scan = new Scanner(scan.nextLine()).useDelimiter("\\s*,\\s*");
//
//        SimpleBST tree2 = new  SimpleBST();
//        
//        while (scan.hasNextInt() ){
//            tree2.insert(scan.nextInt());
//        }
//        System.out.print(tree1.similar(tree2));
        SimpleBST.print(tree1, new SimpleTreeWriterImpl(System.out));
        
        PrintStream writeTree1 = new PrintStream(new File("T1.out"));
        SimpleBST.print(tree1, new SimpleTreeWriterImpl(writeTree1));
        writeTree1.close();
        PrintStream writeTree2 = new PrintStream(new File("T2.out"));
        SimpleBST.print(tree2, new SimpleTreeWriterImpl(writeTree2));
        writeTree2.close();
    }
}
