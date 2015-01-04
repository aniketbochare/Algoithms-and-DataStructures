/**
 * @author Aniket Bochare
 * Implementation of Tree and some utility functions. Adapted as per Career Cup book by Gayle Laakmann McDowell
 * Date - 01/03/2015
 */

package DataStructures;

public class TreeNode {
	
	public int data;
	public TreeNode left;
	public TreeNode right;
	public TreeNode parent;
	
	public TreeNode(int value) {
		// TODO Auto-generated constructor stub
		this.data = value;
		this.left = this.right = null;
	}
//Set left child.
	public void setLeftChild (TreeNode node) {
		this.left = node;
		if (node != null) {
			node.parent = this;
		}
		
	}
	
	//Set right child.
	public void setRightChild (TreeNode node) {
		this.right = node;
		if (node != null) {
			node.parent = this;
		}
		
	}
	
	//Insert into tree inorder maintained.
	public void insertInOrder(int value) {
		if (value <= data) {
			if (left == null) {
				setLeftChild(new TreeNode(value));
			} else {
				left.insertInOrder(value);
			}
		} else {
			if (right == null) {
				setRightChild(new TreeNode(value));
			} else {
				right.insertInOrder(value);
			}
		}
	}
	
	//Check if the tree is a binary search tree.
	public boolean isBinarySearchTree(){
		if (left != null) {
			if (data < left.data || !left.isBinarySearchTree()) {
				return false;
			}
		}
		
		if (right != null) {
			if (data >= right.data || !right.isBinarySearchTree()) {
				return false;
			}
		}		
		
		return true;
	}
	
	//Find the height of the tree.
	public int treeHeight () {
		int leftTreeHeight = left != null ? left.treeHeight() : 0;
		int rightTreeHeight = right != null ? right.treeHeight() : 0;
		return 1 + Math.max(leftTreeHeight, rightTreeHeight);
	}
	
	//Find a node with a value in a tree
	public TreeNode findNode(int value) {
		if (value == data) {
			return this;
		} else if (value <= data) {
			return left != null ? left.findNode(value) : null;
		} else if (value > data) {
			return right != null ? right.findNode(value) : null;
		}
		return null;
	}
	
	//Create a binary tree from inorder traversal or sorted array.
	
	private static TreeNode addToTree(int arr[], int start, int end){
		if (end < start) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode n = new TreeNode(arr[mid]);
		n.setLeftChild(addToTree(arr, start, mid - 1));
		n.setRightChild(addToTree(arr, mid + 1, end));
		return n;
	}
	
	public static TreeNode createMinimalBST(int array[]) {
		return addToTree(array, 0, array.length - 1);
	}
	
	public boolean deleteFromTree(int value){
		if (value == data && left ==null && right == null)
		{
			this.data = value;
			this.left = this.right = null;
			return true;
		}
		else if(value < data){
			left.deleteFromTree(value);
		}
		else if(value > data){
			right.deleteFromTree(value);
		}
		//When node has no children
		else {
            if (left != null && right != null) {
                  this.data = right.minValue();
                  right.deleteFromTree(this.data);
            } else if (parent.left == this) {
                  parent.left = (left != null) ? left : right;
            } else if (parent.right == this) {
                  parent.right = (left != null) ? left : right;
            }
        return true;
      }
		return false;
		
	}

	public int minValue() {
        if (left == null)
              return data;
        else
              return left.minValue();
  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
