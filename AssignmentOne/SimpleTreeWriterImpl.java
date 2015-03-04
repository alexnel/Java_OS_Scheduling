import java.io.PrintStream;
/**
 * Printing of a simple binary tree structure. 
 * 
 * @author Alexandra Nel 
 * @version 3 March 2015
 */
 
public class SimpleTreeWriterImpl extends Object implements SimpleTreeWriter {
   
   public SimpleTreeWriterImpl(PrintStream output) {
   }
   
   public void setDestination(PrintStream output) {
   //Set the PrintStream object to be used for output. An implementing class may wish to supplement this functionality with a constructor that achieves the the same effect write
   }
   
   public void write(BinaryTreeNode node) {
   //Print a textual representation of the given tree structure to the PrintStream object specified with setDestination.
   }
}

//for printing
//step1: determine hight - getHeight()
//step2: determine the max width from height and hence the position of the root node
//step3: as each node is printed, it should whrite that line to file