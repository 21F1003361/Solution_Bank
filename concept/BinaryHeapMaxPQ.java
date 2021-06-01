
public class BinaryHeapMaxPQ<Key extends Comparable<Key>>{


	 Key[] PQ;
	 int N;

	 public void print(){
	 	for(Key a:PQ){
	 		if(a!=null) System.out.println(a.toString());
	 	}
	 }

	public BinaryHeapMaxPQ(int capacity){

		PQ=(Key[]) new Comparable[capacity+1];
		N=0;

	}

	public BinaryHeapMaxPQ(Key[] keys){

		PQ=(Key[]) new Comparable[keys.length+1];
		System.arraycopy(keys,0,PQ,1,keys.length) ;
		N=keys.length;

		for(int i=N/2;i>=1;i++)
			sink(i);

	}

	private void sink(int k){

		while(2*k<=N){
			int j=2*k;
			if(j<N && less(j,j+1)) j++;
			if(!(less(k,j))) break;
			swap(k,j);
			k=j;
		}
	}

	private boolean less(int i,int j){
		return PQ[i].compareTo(PQ[j]) <0;
	}

	private void swap(int i,int j){
		Key temp=PQ[i];
		PQ[i]=PQ[j];
		PQ[j]=temp;
	}

	public void insert(Key k){

		PQ[++N]=k;
		swim(N);
	}

	private void swim(int k){

		while (k>1 && less(k/2,k)){
			swap(k,k/2);
			k=k/2;
		}

	}

	public Key delMax(){
		Key max=PQ[1];
		swap(1,N--);
		sink(1);
		PQ[N+1]=null;
		return max;
	}

	public Key max(){
		return PQ[1];
	}

	public int size(){
		return N;
	}

	public boolean isEmpty(){
		return N==0;
	}

	public Key[] heapsort(Key[] keys){

		BinaryHeapMaxPQ heap=new BinaryHeapMaxPQ(keys);

		while(heap.N>1){
			Key max=(Key)heap.PQ[1];
			swap(1,heap.N);
			sink(1);
			N--;
		}

		return (Key[])heap.PQ;



	}

	public static void main(String[] args) {

		/*Integer[] arr=new Integer[]{7,5,6,4,24,1};
		BinaryHeapMaxPQ hp=new BinaryHeapMaxPQ(10);
		arr=(Integer[])hp.heapsort(arr);
		for(int a:arr){
			System.out.println(a);
		}

		*/

		BinaryHeapMaxPQ<Integer> heap=new BinaryHeapMaxPQ<Integer>(10);
		heap.insert(10);
		heap.insert(20);
		heap.insert(22);
		heap.insert(1);

		heap.print();

		/*System.out.println(heap.max());
		System.out.println(heap.delMax());
		System.out.println(heap.max());
		*/
		


		
	}




}

	