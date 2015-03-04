import java.util.Scanner;
import java.io.*;
import java.util.*;
/**
 *  
 * @author Alexandra Nel 
 * @version 3 March 2015
 */
public class TreeUtils {


    public TreeUtils() {}
    
    public static boolean isPlaceHolder(BinaryTreeNode node) {
    //Determine whether node is a place holder i.e. node==BinaryTreeNode.EMPTY_NODE
      if (node==BinaryTreeNode.EMPTY_NODE)
         return true;
      else
         return false;
    }
    
    public static List<BinaryTreeNode> levelZero(BinaryTreeNode tNode) {
    //Obtain a list containing the root node of the given structure i.e. tNode itself.
    	List<BinaryTreeNode> zeroNode = new ArrayList<BinaryTreeNode> ();
    	zeroNode.add(tNode);
    	return zeroNode;
    }
    
    public static List<BinaryTreeNode> nextLevel(List<BinaryTreeNode> level) {
    //Given a list of nodes, obtain the next level.
    //If the tree structure is incomplete, BinaryTreeNode.EMPTY_NODE is inserted as a place holder for each missing node.
    	List<BinaryTreeNode> nextNode = new ArrayList<BinaryTreeNode> ();
    	for (int i = 0; i<level.size(); i++)
    	{
    		if (level.get(i).hasLeft()==false)
    			nextNode.add(BinaryTreeNode.EMPTY_NODE);
    		else
    			nextNode.add(level.get(i).getLeft());
    		if (level.get(i).hasRight()==false)
    			nextNode.add(BinaryTreeNode.EMPTY_NODE);
    		else
    			nextNode.add(level.get(i).getRight());
    	}
    	return nextNode;
    }
    
    public static boolean similar(BinaryTreeNode treeStructOne, BinaryTreeNode treeStructTwo) {
    //Determine whether one tree node structure is similar (has the same structure) as another
    
      //step1: see if both or one is null - output accordingly
      if (treeStructOne == null && treeStructTwo == null)
         return true;
      else if (treeStructOne == null || treeStructTwo == null)
         return false;
      else if (treeStructOne.getLeft() == null && treeStructTwo.getLeft() == null && treeStructOne.getRight() == null && treeStructTwo.getRight() == null)
    	  return true;
      //step2: check if both of current node have left/have right
      else if (treeStructOne.hasLeft() == treeStructTwo.hasLeft() && treeStructOne.hasRight() == treeStructTwo.hasRight())
      {  
      //step3: go down left/right/both nodes, apply recursion
         if (treeStructOne.hasLeft() && treeStructOne.hasRight())
         {  if (similar(treeStructOne.getLeft(), treeStructTwo.getLeft())==true)
               return similar(treeStructOne.getRight(), treeStructTwo.getRight());
            else
               return false;
         }
         else if (treeStructOne.hasLeft()==true && treeStructOne.hasRight()==false)
        	 return similar(treeStructOne.getLeft(), treeStructTwo.getLeft());
         else
        	 return similar(treeStructOne.getRight(), treeStructTwo.getRight());
      }
      else
         return false;
    }
}
