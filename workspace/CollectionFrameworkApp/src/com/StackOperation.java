package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackOperation {
	Stack<String> ss = new Stack<String>();
	//Map<Integer, String> mm = new HashMap<Integer, String>();
	public String push(String s) {
		if(ss.size()<4) {
			ss.push(s);
			return "Data added in stack";
		}else {
			return "Stack is full";
		}
	}
	public String pop() {
		if(ss.size()==0) {
			return "Stack is empty";
		}else {
			return ss.pop();
		}
	}
	public String search(String s) {
		if(ss.search(s)<0) {
			return "Element is not present";
		}else {
			return "Element present";
		}
	}
	public Stack<String> retrive() {
		return ss;
	}
}
