package com.hashmap.Hashmap_Programs;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


public class MyHashMapTest {
	

	@Test
  	public void givenSentence_whenAddedToList_shouldReturnWordFrequency() 
	{
      	String sentence = "To be or not to be or be";
      	MyHashmap<String, Integer> myHashMap = new MyHashmap<>();
      	String[] words = sentence.toLowerCase().split(" ");
      	for(String word : words) 
      	{
          		Integer value = myHashMap.get(word);
          		if (value == null) 
          		{
              		value = 1;
          		} else 
          		{
              		value = value + 1;
          		}
          		myHashMap.add(word, value);
      	}
      	int frequency = myHashMap.get("to");
      	System.out.println(myHashMap);
      	Assert.assertEquals(2, frequency);
	}
}
