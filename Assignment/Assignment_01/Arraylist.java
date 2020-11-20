import java.util.*;
public class Arraylist
{
	double x; // a=(1 by 4)1/4 
	double y; // b = (3 by 4)3/4
	int size;
	static int a;
	int remove;
	int top;
	static double length;
	int array[];
	// constructor of Arraylist
	Arraylist()
	{
		x = 0.25;
		y = 0.75;
		top = 0;
		size = 4;
		array = new int[size];
	}
	// Added an new element to an array
	public void add(int e)
	{
		array[top] = e;
		top++;
	}
	//resizing the array
	public void resize()
	{
		if(length == x) {
			int newarray[] = new int[(size/2)];
			for(int i = 0; i < array.length; i++) {
				newarray[i] = array[i];
			}
			array = newarray;
			size = size/2;
			for(int j : newarray) {
				System.out.print(j + " ");
				}	
		}	
		else if(length == y) {
			int newarray[] = new int[size*2];
			for(int i = 0; i < array.length; i++) {
				newarray[i] = array[i];
			}
			size = size * 2;
			array = newarray;
			for(int j : newarray) {
			System.out.print(j + " ");
			}
			System.out.println();
		}
		else {
			System.out.println("ArrayIndexOutOfBoundRange");
		}
	}
	// to remove an element from an array
	public void pop(){
		top--;
		remove =  array[top];
		array[top] = 0;
		int count = 0;
		for(int i = 0; i < array[i]; i++){
			count++;
		}
		x = count;
		length = (double)count/size;
		System.out.println("Removed element is "+remove);
	}
	//To return the size of an array
	public int size(){
		return size;
	}
	// convert the array into string
	public String toString(){
		String p = Arrays.toString(array);
		return p;
	}
	public static void main(String[] args) 
    { 
        Arraylist obj = new Arraylist(); 
  
        // add 4 elements in array 
        obj.add(1); 
        obj.add(2); 
        //obj.add(3); 
        //obj.add(4); 
       
        obj.pop();
        obj.resize();


        System.out.println("toString is: "+obj.toString());
        //System.out.println("The number of elements in the new Array is " +a);
        System.out.println("The size of the New array is "+obj.size()); 

        assert(obj.size()) == 4;
        System.out.println("All test are passed");
    }
}
  
