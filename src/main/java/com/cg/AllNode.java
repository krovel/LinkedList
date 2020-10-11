package com.cg;

public interface AllNode<K> {

	public K getKey();

	public void setKey(K key);

	public AllNode<K> getNext();

	public void setNext(AllNode next);
}