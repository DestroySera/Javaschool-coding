package week03.week03day4.linklist;

import java.util.LinkedList;

import week03.week03day4.UserInfo;

public class Node {
	public static void main(String[] args) {
		LinkedList<UserInfo> list = new LinkedList<>();
		UserInfo test = new UserInfo("asd", 1, 1, 1);
		UserInfo test2 = new UserInfo("asd", 1, 3, 1);
		UserInfo test3 = new UserInfo("asd", 1, 3, 1);
		UserInfo test4 = new UserInfo("asd", 1, 1, 1);
		UserInfo test5 = new UserInfo("asd", 1, 2, 1);
		
		list.add(test);
		list.add(test2);
		list.add(test3);
		list.add(test4);	
		
		System.out.println(list.get(2));
		
		list.add( 2 ,  test5);
		
	
		System.out.println(list.get(2));
	}
}
