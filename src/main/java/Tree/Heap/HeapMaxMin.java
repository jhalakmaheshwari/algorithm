package Tree.Heap;

/**
 * Created by Jhalak on 7/7/2017.
 */
public class HeapMaxMin
{
    public int[] arrHeap;
    public int count=0;
    public void createHeap(int capacity){
        this.arrHeap=new int[capacity];
    }

    public int parent(int i){
        if(i<=0 || i>this.arrHeap.length)
            return -1;
        return (i-1)/2;
    }

    public int leftChild(int i){
        if(i<=0 || i>this.arrHeap.length)
            return -1;
        return (2*i)+1;
    }
    public int rightChild(int i){
        if(i<=0 || i>this.arrHeap.length)
            return -1;
        return (2*i)+2;
    }

    //FOR MAXHEAP
    public int maximumElement(){
        return this.arrHeap[0];
    }
    //FOR MINHEAP
    public int minimumElement(){
        return this.arrHeap[0];
    }

    public void percolateDown(int i){
        int l,r,max,temp;
        l=leftChild(i);
        r=rightChild(i);
        if(l!=-1 && this.arrHeap[i] < this.arrHeap[l]){
            max=l;
        }
        else
        {
            max=i;
        }
        if(r!=-1 && this.arrHeap[i] < this.arrHeap[r]){
            max=r;
        }

        if(max != i){
            temp=this.arrHeap[i];
            this.arrHeap[i]=this.arrHeap[max];
            this.arrHeap[max]=this.arrHeap[i];
        }
        percolateDown(max);
    }

    public void insertIntoHeap(int data){
        if(this.count == this.arrHeap.length){
            resizeHeap();
        }
        this.count++;
        int i=this.count-1;
        while(i>0 && data > this.arrHeap[(i-1)/2]){
            this.arrHeap[i]=this.arrHeap[(i-1)/2];
            i=(i-1)/2;
        }
        this.arrHeap[i] = data;
    }

    private void resizeHeap() {
        int[] arrOld=new int[this.arrHeap.length];
        System.arraycopy(this.arrHeap, 0, arrOld, 0, this.count);
        this.arrHeap = new int[this.arrHeap.length * 2];
        for (int i=0;i<arrOld.length;i++){
            this.arrHeap[i]=arrOld[i];
        }
        arrOld=null;
    }

    public void destroyHeap(){
        this.count=0;
        this.arrHeap=null;
    }

    public static void main(String[] args) {
        HeapMaxMin heapMax=new HeapMaxMin();
        heapMax.createHeap(7);
        heapMax.insertIntoHeap(17);
        heapMax.insertIntoHeap(13);
        heapMax.insertIntoHeap(6);
        heapMax.insertIntoHeap(1);
        heapMax.insertIntoHeap(4);
        heapMax.insertIntoHeap(2);
        heapMax.insertIntoHeap(5);
        heapMax.insertIntoHeap(8);
        System.out.println("MAX: "+heapMax.maximumElement());

    }
}
