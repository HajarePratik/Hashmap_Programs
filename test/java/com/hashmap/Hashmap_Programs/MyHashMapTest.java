package com.hashmap.Hashmap_Programs;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


public class MyHashMapTest {
	
	// UC1 Finding a (to) word and Also Getting Another Word
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
	
	// UC2 Finding a Paranoid word and Also Getting Another Word
	
	@Test
	public void givenPara_whenWordsAdded_shouldReturnWordFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid but "
				+ "because they keep putting themselves deliberately into paranoid avoidable situations";
		MyHashmap<String, Integer> myHashMap = new MyHashmap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer value = myHashMap.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			myHashMap.add(word, value);
		}
		int frequency = myHashMap.get("paranoid");
		System.out.println(myHashMap);
		Assert.assertEquals(3, frequency);
	}
}
