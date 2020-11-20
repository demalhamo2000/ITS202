//implementation of Binary Search
class BinarySearch {
   
    // Returns index of x if it is present
    // in arr[l..r], else return -1
    int binarySearch(int[] arr, int left, int right, int k)
    {
        //Restrict the boundary of right index 
        // and the left index to prevent 
        // overflow of indices. 
        if (right >= left && left<arr.length-1) {
           
            int mid = left + (right - left) / 2;
 
            // If the element is present at the middle itself
            if (arr[mid] == k)
                return mid;
 
            // If element is smaller than mid, then it can only be present in leftside
            if (arr[mid] > k)
                return binarySearch(arr, left, mid - 1, k);
 
            // Else the element can be present on right side
            return binarySearch(arr, mid + 1, right, k);
        }
 
        return -1;
    }
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = {10,20,30,40};
        int n = arr.length;
        int k = 20;
        int temp = ob.binarySearch(arr, 0, n - 1, k);
        if (temp == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + temp);
    }
}
