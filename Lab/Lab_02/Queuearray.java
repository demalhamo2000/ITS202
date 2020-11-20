public class Queuearray {
	int front;
	int max;
	int rear;
	int size;
	int arr[];
	public Queuearray(){
		front = 0;
		max = 10;
		rear = 0;
		size = 0;
		arr = new int[max];
	}
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	public int len() {
		if(isEmpty()) {
			return 1;
		}
		return size;
	}
	public void enQueue(int x) {
		if(rear > max) {
			System.out.println("QueueOverFlowError");
		}
		else{
		arr[rear] = x;
		rear++;
		size++;
		System.out.println("Elements : " + x);
		}
	}
	public int deQueue() {
		if(rear > max) {
			System.out.println("QueueUnderFlowError");
		}
		else {
			int x;
			x = arr[front];
			front++;
			size--;
			return x;
		}
		return front;
	}
	public int printFirstElement() {
		if(isEmpty()) {
			return 1;
		}
		else {
		int x;
		x = arr[front];
		return x;
		}
	}
	public static void main(String[] args) {
		Queuearray obj = new Queuearray();
		obj.enQueue(1);
		obj.enQueue(2);
		obj.enQueue(3);
		obj.enQueue(4);
	System.out.println("Element remove is " +obj.deQueue());
	System.out.println("The first element in the queue is : " + obj.printFirstElement());
	System.out.println("There is no queue elements : " + obj.isEmpty());
	System.out.println("The size of a queue elements is : " + obj.len());
		
	assert(obj.isEmpty() == false);
	assert(obj.printFirstElement() == 5);
	assert(obj.len() == 4);
		System.out.println("Al are tested correctly");
	 }
}
