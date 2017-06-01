package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class DyanamicArray {
	private int capacity=2;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	private Object arr[]=null;
	private int size=0;
	public DyanamicArray(){
		this.arr=new Object[capacity];
	}
	public DyanamicArray(Object[] d){
		this.arr=new Object[capacity];
		this.arr=d;
	}
	public void add(Object var){
		
		if(this.size < capacity){
			this.arr[this.size]=var;
			size++;
		}
		else{
			this.expandArr();
			this.arr[this.size]=var;
			size++;
		}
		
	}
	
	public void add(int index, Object var){
		if(index<=size){
			Object temp[]=Arrays.copyOf(this.arr, this.arr.length);
			boolean flag=false;
			for(int i=0; i<size; i++){
				if(flag==true){
					arr[i]=temp[i-1];
				}
				else{
					if(i==index){
						arr[i]=var;
						size++;
						if(size>capacity)
							expandArr();
						flag=true;
					}
				}
			}
		}
		else{
			throw new IndexOutOfBoundsException();
		}
	}
	
	public void remove(int index){
		if(index<=size){
			Object temp[]=Arrays.copyOfRange(this.arr,index+1,size);
			arr[index]=null;
			int j=0;
			size--;
			for (int i = index; i < size; i++) {
				arr[i]=temp[j];
				j++;
			}
			arr[size]=null;
			System.out.println("tanatana");
		}
		else{
			throw new IndexOutOfBoundsException();
		}
	}
	
	public void expandArr() {
		// TODO Auto-generated method stub
		Object temp[]=this.arr;
		this.capacity=this.capacity*2;
		this.arr=new Object[this.capacity];
		
		for (int i = 0; i < temp.length; i++) {
			arr[i]=temp[i];
		}
	}
	
	public Object get(int index){
		if(index <= size){
			return arr[index-1];
		}
		else{
			throw new IndexOutOfBoundsException();
		}
	}
	
	public int indexOf(Object var){
		for (int i = 0; i < arr.length; i++){
			if(arr[i].equals(var))
				return i;
		}
		return -1;
	}
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		DyanamicArray ds=new DyanamicArray();
		
		ds.add("Jhalak");
		ds.add("Maheshwari1");
		ds.add("Jhalak1");
		ds.add("Maheshwari");
		/*ds.add(4);
		ds.add(2,5);
		ds.remove(2);*/
//		System.out.println(ds.get(2));
		System.out.println(ds.indexOf("Maheshwari2"));
		
	
		// add to a particular position in arraylist
		ArrayList a=new ArrayList();
	
		a.add(5);
		a.add(7);
		a.add(0, 4);
		a.get(0);
		
		// remove from arraylist
	}
}
