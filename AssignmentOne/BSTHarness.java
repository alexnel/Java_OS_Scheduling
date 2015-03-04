import java.util.Scanner;
import java.io.PrintStream;
import java.io.*;
import java.util.*;
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
        System.out.print("Enter a second comma separated sequence of node values: ");
        Scanner scan = new Scanner(System.in);
        scan = new Scanner(scan.nextLine()).useDelimiter("\\s*,\\s*");

        SimpleBST tree2 = new  SimpleBST();
        
        while (scan.hasNextInt() ){
            tree2.insert(scan.nextInt());
        }
        
        if (tree1.similar(tree2))
        	System.out.println("The two trees are similar.");
        else
        	System.out.println("The two trees are not similar.");
        
        System.out.print("Tree one:");
        SimpleBST.print(tree1, new SimpleTreeWriterImpl(System.out));
        System.out.print("Tree two:");
        SimpleBST.print(tree2, new SimpleTreeWriterImpl(System.out));
//        PrintStream writeTree1 = new PrintStream(new File("T1.out"));
//        SimpleBST.print(tree1, new SimpleTreeWriterImpl(writeTree1));
//        writeTree1.close();
//        PrintStream writeTree2 = new PrintStream(new File("T2.out"));
//        SimpleBST.print(tree2, new SimpleTreeWriterImpl(writeTree2));
//        writeTree2.close();
    }
}
