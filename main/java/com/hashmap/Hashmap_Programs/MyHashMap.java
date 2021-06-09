package com.hashmap.Hashmap_Programs;

public class MyHashmap<T, V> 
{
	LinkedList<T> myLinkList;

	public MyHashmap() 
	{
		this.myLinkList = new LinkedList<>();
	}

	public V get(T key) 
	{
		MyMapNode<T, V> myMapNode = (MyMapNode<T, V>) this.myLinkList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public void add(T key, V value) 
	{
		MyMapNode<T, V> myMapNode = (MyMapNode<T, V>) this.myLinkList.search(key);
		if (myMapNode == null) 
		{
			myMapNode = new MyMapNode<>(key, value);
			this.myLinkList.append(myMapNode);
		} 
		else 
		{
			myMapNode.setValue(value);
		}

	}

	@Override
	public String toString() {
		return "MyHashMap [myLinkList=" + myLinkList + "]";
	}
}
