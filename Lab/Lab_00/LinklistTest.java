public class LinklistTest{
	public static void main(String[] args){
		Linklist obj1 = new Linklist();

		obj1.addFirst(1);
		obj1.addLast(2);
		obj1.addLast(3);

		//assert(obj.isEmpty().equals(false));
		assert(obj1.size()==3);
		assert(obj1.first()==1);
		assert(obj1.last() == 3);
		assert(obj1.removeFirst()==1);
		assert(obj1.size()==2);
		assert(obj1.first()==2);

		System.out.print("All cases are passed");
	}

}