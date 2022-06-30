package com.ktds.step03.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> stack = new LinkedList<String>();
		stack.offer("아이유"); // 1
		stack.offer("박보검"); // 2
		stack.offer("송강"); // 3
		stack.offer("정국"); // 4
		stack.offer("수지"); // 5
		System.out.println(stack.isEmpty()+"/"+stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty()+"/"+stack.size());
		System.out.println(stack.poll());
		System.out.println(stack.poll());
		System.out.println(stack.poll());
		System.out.println(stack.isEmpty()+"/"+stack.size());
		
	}

}
