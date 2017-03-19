package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Stack<E> {

	static int pushcount = -1;
	ArrayList<E> a = new ArrayList<E>();

	public ArrayList<E> viewStack() {

		// System.out.println(pushcount +" "+a.get(-1));
		if (pushcount >= 0) {
			System.out.println("Elements of Stack :");
			for (int i = pushcount; i >= 0; i--) {
				System.out.println(a.get(i));
			}
		} else
			System.out.println("Stack Empty!");

		return a;
	}

	public E push(E obj) {
		a.add(obj);
		pushcount++;
		return obj;
	}

	public E pop()

	{
		Object obj = new Object();

		if (pushcount >= 0) {
			obj = a.get(pushcount);
			a.remove(pushcount);
			pushcount--;
			return (E)obj;
		} 
		else {
			obj = "Nothing to Pop. Stack Empty!";
			return (E)obj;
		}

		
	}

	public static void main(String s[]) {

		Stack stack = new Stack();
		stack.push("Aman1");
		stack.push("Purva");
		stack.push("Uttra");
		stack.push(12345);

		// System.out.println("Push count : " + stack.pushcount);
		stack.viewStack();
		System.out.println("Popping1 :" + stack.pop());
		// stack.viewStack();
		stack.push("Aman2");
		stack.viewStack();
		System.out.println("Popping2 :" + stack.pop());
		stack.viewStack();
		System.out.println("Popping3 :" + stack.pop());
		System.out.println("Popping4 :" + stack.pop());
		System.out.println("Popping5 :" + stack.pop());
		System.out.println("Popping6 :" + stack.pop());
	
		stack.viewStack();
	}
}
