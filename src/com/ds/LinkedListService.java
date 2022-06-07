package com.ds;

import java.util.Scanner;

public class LinkedListService {
   Node head;
   public void insert(int data) {
	Node node=new Node();
	node.data=data;
	node.next=null;
	if(head==null) {
		head=node;
	}
	else
	{
		Node n=head;
		while(n.next!=null) {
			n=n.next;
		}
		n.next=node;
	}
   }
//   insert at between through index
   public void insertAtBetween(int index,int data) {
	  Node node=new Node();
	  node.data=data;
	  node.next=null;
	  Node n =head;
	  if(index==0) {
		  insertatstart(data);
	  }else {
	  for(int i=0;i<index-1;i++) {
		  n=n.next;
		  }
	  node.next=n.next;
	  n.next=node;
	  }
	}
   public void insertLast(int data) {
       Node currentNode = head;

       while(currentNode.next != null) {
           currentNode = currentNode.next;
       }
       Node node = new Node(data);
       node.setData(data);
       currentNode.setNext(node);
   }
   
   public Node deleteFirst() {
	   Node n=head;
	   head=head.next;
	   return n;
	}
   public void deleteAt(int index) {
	   if(index==0) {
		   head=head.next;
	   }
	   else {
		   Node n =head;
		   Node n1=null;
		   for(int i=0;i<index-1;i++) {
			   n=n.next;
			   
		   }
		   n1=n.next;
		   n.next=n1.next;
		   System.out.println("n1"+n1.data);
	   }
   }
   public void insertatstart(int data) {
	    Node node=new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
	   
   }
   public static int findsize(Node n) {
	   int size=0;
	   while (n!=null) {
		   size++;
		   n=n.getNext();
		   
	   }
	return size;
	   
   }
   public void insertInBetween(int before,int data) {
       Node currentNode = head;

       while(currentNode.data != before) {
           currentNode = currentNode.next;
       }
       Node node = new Node(data);
       node.next = currentNode.next;
       currentNode.next = node;
   }
    public void show() {
	  Node node=head;
	  while(node.next!=null) {
		System.out.println(node.data);
		node=node.next;
	}
	System.out.println(node.data);
}

}
