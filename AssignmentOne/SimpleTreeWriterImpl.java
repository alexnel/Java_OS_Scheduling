import java.io.PrintStream;
import java.io.*;
import java.util.*;
/**
 * Printing of a simple binary tree structure. 
 * 
 * @author Alexandra Nel 
 * @version 3 March 2015
 */
 
public class SimpleTreeWriterImpl extends Object implements SimpleTreeWriter {
   
   PrintStream output;
	
   public SimpleTreeWriterImpl(PrintStream output) {
   }
   
   public void setDestination(PrintStream output) {
   //Set the PrintStream object to be used for output. An implementing class may wish to supplement this functionality with a constructor that achieves the the same effect write
	   this.output = output;
   }
   
   public void write(BinaryTreeNode node) {
   //Print a textual representation of the given tree structure to the PrintStream object specified with setDestination.
	   TreeUtils tree = new TreeUtils();
	   SimpleBST bst = new SimpleBST();
	   List<BinaryTreeNode> currentlevel = tree.levelZero(node);
	   int height = bst.getHeight();
	   for (int j=0; j<4; j++)//equation of height spacing needed)
	   {
		   output.println("   ");//3spaces??
	   }
	   output.println(currentlevel.get(0));
	   currentlevel = tree.nextLevel(currentlevel);
	   //int level = 2;//this is the level we are on - will be compared to height later.
	   while(currentlevel!=null)
	   {
		   currentlevel = tree.nextLevel(currentlevel);
		   for (int i=0; i<currentlevel.size(); i++)
		   {
			   //need something here for the spacing between each node.
			   if (currentlevel==null)
				   output.println("   ");//3spaces?
			   else
				   output.println(currentlevel.get(i));//format this to be three spaces wide.
		   }
		   //level++;
	   }
   }
}

//set currentlevel to zerolevel
//by accessing the level it gives you a list of that line
//have a while loop
//determine spacing, print "   " for null and blanks (output.println("")
//make currentlevel = nextLevel(currentlevel)

