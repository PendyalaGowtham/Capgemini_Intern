
// this class is for AssignmentGeneric3 program

package Genericpackage;

public class swap1<T> {
	
	public <T> T[] swap(T array[], int i, int j)
	{
		T temp;
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		return array;
	}

}
