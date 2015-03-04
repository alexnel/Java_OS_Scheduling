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
	   int leading = (int)((Math.pow(2,height)-1)/2);
	   //print leading spaces
	   for (int j=0; j<leading; j++)
	   {
		   output.println(" ");
	   }
	   output.printf("%3d", currentlevel.get(0).getItem());
	   currentlevel = tree.nextLevel(currentlevel);
	   int level = 1;//this is the level we are on - will be compared to height later.
	   while(currentlevel!=null)
	   {
		   leading = (int)((Math.pow(2,height-level)-1)/2);
		   int between = (int)(Math.pow(2,height-level));
		   //print leading spaces
		   for (int l=0; l<leading; l++)
		   {
			   output.println(" ");
		   }
		   //chnage level using recursion
		   currentlevel = tree.nextLevel(currentlevel);
		   //loop through items in list
		   for (int i=0; i<currentlevel.size(); i++)
		   {
			   //need something here for the spacing between each node.
			   if (tree.isPlaceHolder(currentlevel.get(i)))
				   output.println("   ");//3spaces?
			   else
				   output.printf("%3d", currentlevel.get(i).getItem());
			   for (int k=0; k<between; k++)
			   {
				   output.println(" ");
			   }
		   }
		   level++;
	   }
   }
}

//set currentlevel to zerolevel
//by accessing the level it gives you a list of that line
//have a while loop
//determine spacing, print "   " for null and blanks (output.println("")
//make currentlevel = nextLevel(currentlevel)

