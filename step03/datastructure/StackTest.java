package com.ktds.step03.datastructure;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<String>();
		stack.push("아이유"); // 5
		stack.push("박보검"); // 4 
		stack.push("송강"); // 3
		stack.push("정국"); // 2
		stack.push("수지"); // 1
		System.out.println(stack.isEmpty()+"/"+stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty()+"/"+stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty()+"/"+stack.size());
		
	}

}
