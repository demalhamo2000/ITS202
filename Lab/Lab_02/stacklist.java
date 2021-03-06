import java.util.*;

class Node{
	public static int element;
	public static Node next;
};
class stack{
	public static  Node top;
	public static int size;

	public stack(){
		this.top = null;
		size = 0;
	}
	// public int size(){
	// 		return size;
	// 	}
	// }
	public void push(int x){
		Node node = new Node();

		if (node == null){
			System.out.print("Heap Overflow");
			return;
		}
		else{
			System.out.print("\n Push element : " +x);
		}
		node.element = x;
		node.next = top;
		top = node;
		size = size +1;
	}
	public static boolean isEmpty(){
		return top == null;
	}
	public static int top(){
		if (!isEmpty()){
			return top.element;
		}
		else{
			System.out.println("Stack is empty");
			return -1;
		}
	}
	public void pop(){
		if (top == null){
			System.out.print("StackOverflowError");
			return;
		}
		else{
			System.out.println("\nThe popped element is "+ top());
		}
		top = (top).next;
		size -= 1;
	}
	public int size() {
		return size;
	}
}
class stacklist{
	public static void main(String[] args){
		stack obj1 = new stack();

		obj1.push(1);
		obj1.push(2);
		obj1.push(1);
		obj1.push(2);

		System.out.println("\nTop element of the array is "+ obj1.top());
		System.out.println("\n The size of the stack is "+ obj1.size());

		obj1.pop();

		if (obj1.isEmpty()){
			System.out.print("Stack is empty\n");
		}
		else{
			System.out.print("Stack is not empty\n");
		}


	assert(obj1.isEmpty() == false);
	assert(obj1.top() == 2);
	assert(obj1.size() == 4);
		System.out.println("All are tested correctly");
	}
}