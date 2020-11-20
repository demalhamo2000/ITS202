class linklist {
	Node front;
	Node tail;
	int size;
	public linklist() {
		front = null;
		tail = null;
		size = 0;
	}
	public void enqueue(int e) {
		Node newest = new Node(e, null);
		if(size == 0) {
			front = newest;
			tail = newest;
			System.out.println("enqueue " +e);
		}
		else {
			tail.setNext(newest);
			tail = newest;
			System.out.println("enqueue " +e);
		}
		size = size + 1;
	}
	public int dequeue() {
		int deletedElement = front.getElement();
		if(isEmpty()) {
			return 1;
		}
		else {
			front = front.getNext();
			size -= 1;
			System.out.println("dequeue : " +deletedElement);
		}
		return deletedElement;
	}
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	public int printFrontElement() {
		int frontElement = front.getElement();
		if(size == 0) {
			System.out.println("StackUnderFlowError");
		}
		else {
			return frontElement;
		}
		return printFrontElement();
	}
	public int len() {
		if(isEmpty()) {
			return 1;
		}
		return size;
	}
}
class Node{
	//Variable declaration
	private int element;
	private Node next;
	public Node(int element, Node next) {
		this.element = element;
		this.next = next;
	}
	//getElement
	public int getElement() {
		return element;
	}
	//getNext
	public Node getNext() {
		return next;
	}
	//setElement
	public void setElement(int e) {
		element = e;
	}
	//setNext
	public void setNext(Node e) {
		next = e;
	}
}
public class Queuelist{

	public static void main(String[] args) {
		linklist obj = new linklist();
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);
		obj.dequeue();
		System.out.println("The size of stack is : " +obj.isEmpty());
		System.out.println("The first Element of stack is : " +obj.printFrontElement());
		
		assert(obj.isEmpty() == false);
		assert(obj.printFrontElement() == 1);
		assert(obj.len() == 3);
		System.out.println("All are tested correctly");
		
	}
}
