public class SelectionSortExample{
	static void selectionsort(int[] arr) {
		int n =  arr.length;
		int smallestvalue;//let it be an smallest number in an array
		System.out.println("Array Before sort: ");
		for(int a =0; a<n; a++){
			System.out.print(arr[a]);
		}
		for (int i = 0; i <= n-1; i++){
			smallestvalue = i;
			for (int j = i+1; j < n; j++){
				if(arr[j]<arr[smallestvalue]){
					smallestvalue = j;
				}
			}
			int temp = arr[smallestvalue];
			arr[smallestvalue] = arr[i];
			arr[i] = temp;
		}

    }  
    public static void main(String[] args) {  
                int arr[] ={9,1,4,3,6,5,7,8,2};   
                  
                selectionsort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("\nArray After Selection Sort"); // Array displaying sorting  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}
