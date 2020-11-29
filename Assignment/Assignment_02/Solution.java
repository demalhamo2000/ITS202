import java.util.*;

public class Solution<Key extends Comparable<Key>, Value> {
    private Node root;  // declaring a root of bst
    private int size;    // declaring a size of bst
    int z;  // declaring a varible z in bst          
    private class Node {
        private Key key;           // sorted by key
        private Value val;         // associated data
        private Node left, right;  // left and right subtrees
        private int size;          // number of nodes in subtree

        public Node(Key key, Value val, int size) {
            this.key = key;
            this.val = val;
            this.size = size;
        }
    }

    /**
     * Initializes an empty symbol table.
     */
    public Solution() {
       root = null;
       size = 0;
       z = 0;
    }

    /**
     * Returns true if this symbol table is empty.*/
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }

    /**
     * Returns the  size of the symbol table
     */
    public int size() {
        return size;
      
       
    }
// here it will print the key associated with the values.
    public Value get(Key key) {
        if(key == null){ // if the key is null it will throw some  exception 
            throw new IllegalArgumentException("key value is null");
        }    
        return get(root,key); // else it will return the valur of root associated  with its value
    }
    private Value get(Node x, Key key){
        while (x != null){
            int cmp = key.compareTo(x.key); // the value of key will compare with the value  of x(given key)
            if(cmp  < 0) {// if the cmp is less than 0 then it will move toward the left and travers through the left side
                x = x.left;
            }
            else if(cmp>0){ // if cmp is greater than 0 it will move towards the right side and travers thouggh it
                x = x.right;
            }
            else{
                return x.val; // if the cmp is equal to 0 then it will display the valuue of x.
            } 
        }
        return null;
    }

   //  /**
   //   * Inserts the specified key-value pair into the symbol table, overwriting the old key.
        public void put(Key key, Value val) {
        Node newest = new Node(key,val,1);// new Node is created
        if(root == null){
            root = newest;
        }
        else{
            Node temp = root;// declaring node temp as a root
            Node parent;// declaring parent node in bst
            while(true){
                parent = temp;  
                int cmp = key.compareTo(temp.key); // here the given key will compare with keys in the symbol table
                if(cmp < 0){ // if cmp is less than zero temp will move towards the left.
                    temp = temp.left;
                    if(temp == null){// after moving towards the left it will check the value of twemp , if its value ge null they will display the newest as a left side of the parent and size will increase by 1
                        parent.left = newest;
                        size = size + 1;
                        return;
                    }
                    else if(temp.key == key){ // if the  key of the temp is equal to key in the symbol table then the value of that key is replace by the value of temp.
                        temp.val = val;
                        return;
                    }
                }
                else if(cmp > 0){ 
                    temp = temp.right;
                    if(temp == null){
                        parent.right = newest;
                        size = size + 1;
                        return;
                    }
                    else if(temp.key == key){
                        temp.val = val;
                        return;
                    }
                }
            }
        }
        size = size + 1;
    }
    
   //  // /**
   //  //  * Returns the smallest key in the symbol table.

    public Key min() {
        if(size == 0){
           throw new NoSuchElementException("The symbol table is empty"); 
        }
        Node x = root;
        // loop down to find the leftmost leaf 
        while(x.left != null){
            x = x.left;
        }
        return x.key;
         
    }
  // return the floor of the given key.
   public Key floor(Key key) {
        if(key == null){
            throw new IllegalArgumentException("Key is null");
        }
        if(size == 0){
            throw new NoSuchElementException("Called floor() with empty symbol table");
        }
        Node x = floor(root, key);
        if(x == null){
            return null;
        }
        else {
            return x.key;
        }
    }
    private Node floor(Node x, Key key){
        Node smallest = null;
        while(x != null){
            int cmp = key.compareTo(x.key); // here the given key will compare with the keys in the symbol tables.
            if(cmp == 0){ // if cmp is equal to zero then it will display the x.
                return x;
            }
            else if(cmp < 0){ // if cmp is less than zero then it will move towards the left side from the root
                x = x.left;
            }
            else{ // else it will move toward the rigth side from the root.
                smallest = x;
                x = x.right;
            }
        }
        return smallest;
    }
          
    public Key select(int k){
        z = 0;
        if(k<0 || k>=size){
            throw new IllegalArgumentException("");
        }
        return select(root, k+1).key;
    }
    private Node select(Node x, int k){
        Stack<Node> stack = new Stack<Node>();
        while(!stack.empty() || x != null){
            if(x != null){
                stack.push(x);
                x = x.left;
            }
            else{
                x = stack.pop();
                z ++;
                if(z == k){
                    break;
                }
                x = x.right;
            }
        }
        return x;
    }
    //return all the key between lo and hi includeing both
    public Iterable<Key> keys(Key lo, Key hi){
        if(lo==null || hi==null) throw new IllegalArgumentException("argument to keys() is null");

        Queue<Key> queue = new LinkedList<Key>();
        keys(root, queue, lo, hi); 
        return queue;
    }

    //travers thought the tree and add key to the queue if the key>=lo && key<=hi
    private void keys(Node x, Queue<Key> queue, Key lo, Key hi){ 
        if (x == null) return;  
        
        Node curNode1 = x;  
        //travers through the tree until the Node is null
        while (curNode1 != null){  
      
            int cmp = curNode1.key.compareTo(hi);
            int cam = curNode1.key.compareTo(lo);

            /*if the left node is null set Curnode1 to right node of itself 
            add the key to key if key is in the range*/
            if (curNode1.left == null){   
                if (cmp <= 0 && cam >= 0)  queue.offer(curNode1.key);
                curNode1 = curNode1.right;

            //if the left node of temp1 is not null assign  curNode1.left and initializes temp2
            }else{  
                Node curNode2 = curNode1.left;
                while (curNode2.right != null && curNode2.right != curNode1)  
                    curNode2 = curNode2.right;  
                if (curNode2.right == null){  
                    curNode2.right = curNode1;  
                    curNode1 = curNode1.left; 
            
                }else{  
                    curNode2.right = null;    
                    if (cmp <= 0 && cam >= 0)  queue.offer(curNode1.key);  
                    curNode1 = curNode1.right;  
                }  
            }  
        }   
    }



   
    
    /* Run the program by giving the approriate command obtained from
    input files through input.txt files. The output should be displayed
    exactly like the file output.txt shows it to be.*/
    public static void main(String[] args) {
        Solution<String , Integer> obj = new Solution<String, Integer>();
        obj.put("ABDUL", 1);
        System.out.println(obj.get("ABDUL"));
        obj.put("HRITHIK", 2);
        obj.put("SAI", 3);
        obj.put("SAMAL", 6);
        System.out.println(obj.get("SAI"));
        obj.put("TASHI", 4);
        System.out.println(obj.size());
        System.out.println(obj.min());
        System.out.println(obj.floor("HRITHIK"));
        System.out.println(obj.floor("HAHA"));
        System.out.println(obj.select(2));
        for (String d : obj.keys("ABDUL","TASHI"))
            System.out.print(d+" ");
        // System.out.println();
        // obj.keys("ABDUL","TASHI");
        System.out.println();
        obj.put("CHIMI", 5);
        obj.put("SAMAL", 4);
        System.out.println(obj.get("SAMAL"));
        obj.put("NIMA", 7);
        System.out.println(obj.size());
        System.out.println(obj.get("CHIMI"));
        System.out.println(obj.floor("CHIMI"));
        obj.put("SONAM", 8);
        for (String d : obj.keys("ABDUL","TASHI"))
            System.out.print(d+" ");
        System.out.println();

        // obj.keys("ABDUL","TASHI");
        // System.out.println();
        //System.out.println(obj.KEYS());
    }
}
        
       