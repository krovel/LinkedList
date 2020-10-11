/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cg;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void given3NumberWhenLinkedShouldPassLinkedListTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);

		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);

		assertTrue(result);
	}
	@Test
	public void given3NumberWhenAddedToLinkedShouldBeAddedToTop() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(firstNode);
		myLinkedList.add(secondNode);
		myLinkedList.add(thirdNode);
		
		myLinkedList.printMyList();
		boolean result = myLinkedList.getHead().equals(thirdNode) && myLinkedList.getHead().getNext().equals(secondNode)
				&& myLinkedList.getTail().equals(firstNode);
		assertTrue(result);
	}
	@Test
	public void given3NumberWhenAppendedToLinkedShouldBeAddedToBottom() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		
		myLinkedList.printMyList();
		boolean result = myLinkedList.getHead().equals(firstNode) && myLinkedList.getHead().getNext().equals(secondNode)
				&& myLinkedList.getTail().equals(thirdNode);
		assertTrue(result);
	}
	@Test
	public void given3NumberWhenInseringInBetweenShouldPassLinkedListTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(thirdNode);
		
		myLinkedList.insert(firstNode,secondNode);
		
		myLinkedList.printMyList();
		boolean result = myLinkedList.getHead().equals(firstNode) && myLinkedList.getHead().getNext().equals(secondNode)
				&& myLinkedList.getTail().equals(thirdNode);
		assertTrue(result);
	}
	@Test
	public void given3NumberWhenDeletedFirstElementShouldReturnFirstElement() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);

		AllNode deletedNode = myLinkedList.deleteFirst();
		System.out.print("After deleting first element, ");
		myLinkedList.printMyList();
		assertEquals(firstNode, deletedNode);
	}
	@Test
	public void given3NumberWhenDeletedLastElementShouldReturnLastElement() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);

		AllNode deletedNode = myLinkedList.deleteLast();
		System.out.print("After deleting last element, ");
		myLinkedList.printMyList();
		assertEquals(thirdNode, deletedNode);
	}
	@Test
	public void given3NumberWhenSearchForAnElementShouldReturnElement() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);

		AllNode searchedNode = myLinkedList.search(secondNode.getKey());
		System.out.println("Searched key : " + searchedNode.getKey());
		myLinkedList.printMyList();
		assertEquals(secondNode, searchedNode);
	}
	@Test
	public void given3NumberWhenInsertingAfterAnElementShouldPassLinkedListTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		myLinkedList.insertAfter(30, 40);
		boolean result = myLinkedList.getHead().equals(firstNode) && myLinkedList.getHead().getNext().equals(secondNode)
				&& myLinkedList.getHead().getNext().getNext().equals(myLinkedList.search(40))
				&& myLinkedList.getTail().equals(thirdNode);
		myLinkedList.printMyList();
		assertTrue(result);
	}
	@Test
	public void given3NumberWhenDeletingAnElementShouldPassLinkedListTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(40);
		MyNode<Integer> fourthdNode = new MyNode<Integer>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(firstNode);
		myLinkedList.append(secondNode);
		myLinkedList.append(thirdNode);
		myLinkedList.append(fourthdNode);

		myLinkedList.deleteElement(thirdNode.getKey());
		System.out.println("Size : " + myLinkedList.size());

		boolean result = myLinkedList.getHead().equals(firstNode) && myLinkedList.getHead().getNext().equals(secondNode)
				&& myLinkedList.getTail().equals(fourthdNode);
		myLinkedList.printMyList();
		assertTrue(result);
	}
	@Test
	public void given3NumberWhenAddingElementInOrderShouldPassLinkedListTest() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(40);
		MyNode<Integer> fourthdNode = new MyNode<Integer>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addOrdered(firstNode);
		myLinkedList.addOrdered(secondNode);
		myLinkedList.addOrdered(thirdNode);
		myLinkedList.addOrdered(fourthdNode);

		boolean result = myLinkedList.getHead().equals(secondNode) && myLinkedList.getHead().getNext().equals(thirdNode)
				&& myLinkedList.getHead().getNext().getNext().equals(firstNode)
				&& myLinkedList.getTail().equals(fourthdNode);
		myLinkedList.printMyList();
		assertTrue(result);
	}
}