package com.hashmap.Hashmap_Programs;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

	// UC1 create a binary tree and adding value
	@Test
	public void given3Number_WhenAddedBSTShouldReturnSize() 
	{
		MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		int size = binaryTree.getSize();
		Assert.assertEquals(3, size);
	}
	
	// UC2 create a binary tree and adding value extra value
	@Test
	public void given13Number_WhenAddedBSTShouldReturnSize() {
    	MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
    	binaryTree.add(56);
    	binaryTree.add(30);
    	binaryTree.add(70);
    	binaryTree.add(11);
    	binaryTree.add(22);
    	binaryTree.add(33);
    	binaryTree.add(44);
    	binaryTree.add(55);
    	binaryTree.add(66);
    	binaryTree.add(77);
    	binaryTree.add(88);
    	binaryTree.add(99);
    	binaryTree.add(13);
    	int size = binaryTree.getSize();
    	Assert.assertEquals(13,size);
	}
	
	
}