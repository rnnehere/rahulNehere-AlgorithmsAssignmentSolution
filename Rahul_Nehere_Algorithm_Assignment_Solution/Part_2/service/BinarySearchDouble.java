package service;
public class BinarySearchDouble 
{
	private double arr[];
	private int size;
	
	public BinarySearchDouble() 
	{
		arr = new double[0];
		size = 0;
	}
	
	public BinarySearchDouble(double arr[], int size) 
	{
		this.arr = arr;
		this.size = size;
	}
	
	private int find(int beg, int end, double value) 
	{
		if (end >= beg) {
            int mid = beg + (end - beg) / 2;

            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return find(beg, mid - 1, value);

            return find(mid + 1, end, value);

        }
        return -1;
	}
	
	public boolean isFound(double value) 
	{
		int status = find(0, size - 1, value);
		return status == -1 ? false : true;
	}
}
