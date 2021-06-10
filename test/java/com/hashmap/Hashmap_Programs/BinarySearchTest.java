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
	
	
}