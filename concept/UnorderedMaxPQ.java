
public class UnorderedMaxPQ<key extends Comparable<key>>{

	key[] PQ;
	int N;
	UnorderedMaxPQ(int capacity){

		pq=(key[]) new Comparable[capacity];
		N=0;
	}

	public void insert(Key k){
		pq[N++]=k;
	}
	public void isEmpty(){
		return N==0;
	}
	public key delMax(){

		int max=0;

		for(int i=0;i<N;i++){
			
			if(less(max,i)) max=i;

		}
		swap(max,N-1);
		key k=pq[N-1];
		pq[N-1]=null;
		N--;
		return k;

	}

}