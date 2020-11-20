// Implement Key-indexed counting algorithm.
public class KeyIndex{
	public static void main(String[] args){
		int[] a = {'a','c','d','e','b','f'};

		KeyIndex obj = new KeyIndex();
		obj.keyindex(a);
		for(int i :a){
			System.out.print(i + " ");
		}
	}
	public void keyindex(int[] a){
		int N = a.length;
		int R = 256; // No of  values
		int[] aux = new int[N];
		int[] count = new int[R+1];
		 // Compute frequency counts.
		for (int i = 0; i < N; i++)
		count[a[i] + 1]++;
		 // Transform counts to indices.
		for (int r = 0; r < R; r++)
		count[r+1] += count[r];
		 // Distribute the records.
		for (int i = 0; i < N; i++)
		aux[count[a[i]]++] = a[i];
		 // Copy back.
		for (int i = 0; i < N; i++)
		a[i] = aux[i];
	}
}
	
