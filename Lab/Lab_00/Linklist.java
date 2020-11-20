public class Linklist{
	Node head;
	Node tail;
	int size;
	public Linklist(){
		head = null;
		tail = null;
		size = 0;
	}
	public int size(){
		return size;
	}
	//
	public boolean isEmpty(){
		if (size ==0){
			return true;
		}
		return false;
	}
	//return first element of the list
	public int first(){
		return head.getElement();
	}
	//return last element of the list
	public int last(){
		return tail.getElement();
	}
	public void addFirst(int n){
		Node newest = new Node(n, null);

		if (size == 0){
			head = newest;
			tail = newest;
		}
		else{
			newest.setNext(head);
			head = newest;
		}
		size = size+1;
	}
	public void addLast(int n){
		Node newest = new Node(n, null);

		if (size == 0){
			tail = newest;
			head = newest;
		}
		else{
			tail.setNext(newest);
			tail = newest;

		}
		size = size + 1;
	}
	public int removeFirst(){
		int deletedElement = head.getElement();
		if (size == 0){
			return 0;
		}
		else{
			head = head.getNext();
			size = size-1;
		}
		return deletedElement;
	}
}
class Node{
	private int element;
	private Node next;
	//Constructor
	public Node(int element, Node next){
		this.element = element;
		this.next = next;
	}
	// getElement
	public int getElement(){
		return element;
	}
	//getNext
	public Node getNext(){
		return next;
	}
	//set
	public void setElement(int n){
		element = n;
	}
	//
	public void setNext(Node n){
		next = n;
	}

}
