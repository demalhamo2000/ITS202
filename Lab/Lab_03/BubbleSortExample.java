
public class BubbleSortExample {  
    static void bubbleSort(int[] arr) {
        int n = arr.length;// declaring the array without initialization and finalization 
        System.out.println("Element before Sort: ");
        for (int p=0; p<n; ++p)
            System.out.print(arr[p] + " ");// to print the element before sorting
        System.out.println();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])// comparing the arr[j] and arry[j+1]
                {
                    // swap temp and arr[i]
                    int temp = arr[j];// declare new temp of arr[j]
                    arr[j] = arr[j+1];//
                    arr[j+1] = temp;
                }
    }  
    public static void main(String[] args) {  
                int arr[] ={9,1,4,3,6,5,7,8,2};   
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort"); // Array displaying sorting  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}
    
