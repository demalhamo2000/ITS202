public class stackarray{
	int max;
	int top;
	int arr[];
	int size;

	public stackarray(){
		max = 10;
		top = 0;
		arr = new int[max];
		size = 0;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		if (size == 0){
			return true;
		}
		return false;
	}
	public int top(){
		if (isEmpty()){
			return 0;
		}
		else{
			return top;
		}
	}
	public void push(int a){
		if (top > max){
			System.out.println("StackOverflowError");
		}
		else{
			arr[top++] = a;
			System.out.println(a);
		}
		size = size + 1;
	}
	public int pop(){
		if(size == 0){
			System.out.println("stackUnderFlow");
		}
		else{
			top = arr[top-1];

		}
		size = size -1;
		return arr[top+1];
		
	}
	public static void main(String[] args){
		stackarray obj1 = new stackarray();

		obj1.push(1);
		obj1.push(2);
		obj1.push(1);
		obj1.push(2);

		obj1.push(1);
		obj1.push(2);
		System.out.println("the popped num = "+obj1.pop());
		System.out.println("the size of the array is "+obj1.size());

	assert(obj1.isEmpty() == false);
	assert(obj1.top() == 2);
	assert(obj1.size() == 6);
		System.out.println("All are tested correctly");
		
	}
}