package com.hashmap.Hashmap_Programs;

import com.hashmap.*;

public class MyBinaryTree<K extends Comparable<K>>
{
	// Declearing a node
	private MyBinaryNode<K> root;
	
	// Declearing a Add Method
	public void add(K key)
	{
		this.root = this.addRecusively(root,key);
	}

	// checking a node end
	private MyBinaryNode<K> addRecusively(MyBinaryNode<K> current, K key) {
		if(current == null)
			return new MyBinaryNode<>(key);
			int compareResult = key.compareTo(current.key);
			
			if(compareResult == 0) return current;
			
			if(compareResult < 0)
			{
				current.left = addRecusively(current.left, key);
			}
			else
			{
				current.right = addRecusively(current.right, key);
			}
			
		return current;
	}
	
	// get the size of node
	public int getSize()
	{
		return this.getSizeRecusive(root);
		
	}

	private int getSizeRecusive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecusive(current.left) + this.getSizeRecusive(current.right);
	}
	
	
	public  boolean search(K key) {
    	return search_Node_In_Binary_Tree(root, key);
	}

	public boolean search_Node_In_Binary_Tree(MyBinaryNode<K> root, K key) 
	{
    	if (root == null)
        		return false;
    	if (root.key.compareTo(key) == 0)
        		return true;
    	else if (root.key.compareTo(key) > 0)
       	 	return search_Node_In_Binary_Tree(root.left, key);
    	else
        		return search_Node_In_Binary_Tree(root.right, key);
	}
}