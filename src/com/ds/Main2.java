package com.ds;

import java.util.LinkedList;
import java.util.*;

public class Main2 {
	public static void main(String[] args) {
		LinkedListService list=new LinkedListService();
		 list.insert(56);
		 list.insert(30);
		 list.insertLast(86);
		 list.insert(70);
		list.insertInBetween(56,78);
//     	 list.deleteAt(0);
		 list.show();
	}
}
