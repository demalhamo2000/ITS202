 
public class Quick {

   //  /**
   //   * Rearranges the array in ascending order, using the natural order.
   //   * @param a the array to be sorted
   //   */
    public static void sort(int[] a) {
        //shuffle(a);
        sort(a, 0, a.length - 1);
    
    }

    // quicksort the subarray from a[lo] to a[hi]
    private static void sort(int[] a, int lo, int hi) { 
        if (hi <= lo) return;
        int x = partition(a, lo, hi);
        sort(a, lo, x-1);
        sort(a, x+1, hi);
    }

    // partition the subarray a[lo..hi] so that a[lo..j-1] <= a[j] <= a[j+1..hi]
    // and return the index j.
    private static int partition(int[] a, int lo, int hi) {
        int i = lo;
        int x = hi + 1;
        int v = a[lo];
        while (true) { 

            // find item on lo to swap
            while (less(a[++i], v)) {
                if (i == hi) break;
            }

            // find item on hi to swap
            while (less(v, a[--x])) {
                if (x == lo) break;      // redundant since a[lo] acts as sentinel
            }

            // check if pointers cross
            if (i >= x) break;

            exch(a, i, x);
        }

        // put partitioning item v at a[j]
        exch(a, lo, x);

        // now, a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
        return x;
        
    }

   // /***************************************************************************
   //  *  Helper sorting functions.
   //  ***************************************************************************/
    
    // is v < w ?
    private static boolean less(Comparable v, Comparable w) {
        if (v == w) return false;   // optimization when reference equals
        return v.compareTo(w) < 0;
        
     }
     // exchange a[i] and a[j]
    private static void exch(int[] a, int i, int x) {
        int swap = a[i];
        a[i] = a[x];
        a[x] = swap;  
    }
   // /***************************************************************************
   //  *  Check if array is sorted - useful for debugging.
   //  ***************************************************************************/
    private static boolean isSorted(int[] a) {
        return isSorted(a, 0, a.length - 1);   
    }
    private static boolean isSorted(int[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;  
    }
    // print array to standard output
    private static void show(int[] a) {
        for (int i=0; i<a.length ;i++ ) {
            System.out.print(a[i]);  
        }
    }

    /**
     * Reads in a sequence of values ; quicksorts them; 
     * and prints them to standard output in ascending order. 
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int[] a = {4,2,6,7};
        System.out.println("Element before quick sort:");
        for(int i=0; i < a.length; i++){  
            System.out.print(a[i] + " ");  
        
        } 
        Quick.sort(a);
        System.out.println("");
        System.out.println("Array after quick Sort:");
        for(int i=0; i < a.length; i++){  
            System.out.print(a[i] + " ");
            }
            show(a);
       assert isSorted(a);

    }

}