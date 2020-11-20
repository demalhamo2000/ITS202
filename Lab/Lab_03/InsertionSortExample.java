public class InsertionSortExample {  

    public static void insertionSort(int array[]) {  
        int n = array.length;  

        for (int i = 0; i < n-1; i++) {  

            for (int j = i + 1; j>0 && Compare(j-1, j, array) ;j-- ) {
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
            }
                
            }
        } 
        public static boolean Compare(int i, int j, int[] array){
            if (array[i] > array[j]) {
                return true;  
            }
            return false;   
        }  
       
    public static void main(String[] args) {    
        int[] arr = {7,1,2,4,3,5,6,8};    
        InsertionSortExample obj = new InsertionSortExample();
        System.out.println("Before Insertion Sort");    
        for(int i = 0; i < arr.length; i++){    
            System.out.print(arr[i]);    
        }    
        System.out.println("");
        obj.insertionSort(arr);

        System.out.println("After Insertion Sort"); 
          for(int i = 0; i < arr.length; i++){    
            System.out.print(arr[i]);    
        }   
    }
}

