public class merge{
	int[] array; //Declaring an array
	int[] tempMergeArr;//Declaring temporary arr 
	int length;
	public static void main(String[] args){
		int[] inputArr={12,34,21,13,20,32};
		System.out.println("Array before Merge Sort: ");
		for(int i=0; i < inputArr.length; i++){  
        	System.out.print(inputArr[i] + " ");  
        }
        System.out.println();
		merge ms = new merge();
		ms.sort(inputArr);

        System.out.println("Array after Merge Sort:");
        for(int i=0; i < inputArr.length; i++){  
        	System.out.print(inputArr[i] + " ");
        	}   
		
	}
	public void sort(int inputArr[]){
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergeArr = new int[length];
		divideArray(0,length-1);
	}
	public void divideArray(int lowerIndex,int higherIndex)
	{
		if(lowerIndex<higherIndex)
		{
			int middle=lowerIndex+(higherIndex-lowerIndex)/2;
			divideArray(lowerIndex, middle);//it will sort the left side of an array
			divideArray(middle+1,higherIndex);//it will sort the right side of an array

			mergeArray(lowerIndex, middle, higherIndex);
		}
	}
	public void mergeArray(int lowerIndex, int middle, int higherIndex)
	{
		for(int i=lowerIndex; i<=higherIndex; i++)
		{
			tempMergeArr[i]=array[i];
		}
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		while(i<=middle && j<=higherIndex)
		{
			if(tempMergeArr[i]<=tempMergeArr[j])
			{
				array[k]=tempMergeArr[i];//if the tempMergeArr[i] is less and equal to tempMergeArr[j], array[k] will store the value tempMergeArr[i]
				i++;
			}
			else
			{
				array[k]=tempMergeArr[j];
				j++;
			}
			k++;
		}
		while(i<=middle)
		{
			array[k]=tempMergeArr[i];
			k++;
			i++;
		}
	}
}