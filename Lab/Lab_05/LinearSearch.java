// Implement Linear Search Algorithm.

// 4. Implement Binary Search Algorithm.
public class LinearSearch{
	public void Search(int[] a, int k){
		int n = a.length;
		for(int i = 0; i<n; i++)
			if(a[i]==k){
				System.out.print("The number you search are in index "+ a[i]);
				return;
			}
		System.out.print("no such number");
		
	}
	public static void main(String[] args){
		int[] a = {1,2,7,5,6,3,4,8,9,10};
		int k = 0;
		LinearSearch obj = new LinearSearch();
		obj.Search(a,k);	
	}

		
	
}