
import java.util.*;
public class SymbolTablewithBsearch_ordered{

	int[] keys;
	String[] vals;
	int size;

	public static void main(String[] args) {

		SymbolTablewithBsearch_ordered st=new SymbolTablewithBsearch_ordered(10);
		st.put(2,"Souvik");
		st.put(1,"Megha");

		System.out.println(st.getKeys());
		System.out.println(st.getValues());
		System.out.println(st.Rank(2));

		
	}

	public SymbolTablewithBsearch_ordered(int capacity){

		keys=new int[capacity];
		vals=new String[capacity];
		size=0;


	}

	public void put(int key,String val){

		if(size==0){
			keys[0]=key;
			vals[0]=val;
		}
		else{
			int i=0;
			while(keys[i]!=0 && keys[i]<key) i++;
			if(i==keys.length) System.out.println("Capacity Full");

			int temp_k=keys[i];
			String temp_v=vals[i];
			

			for(int j=keys.length-1;j>i;j--){

					keys[j]=keys[j-1];
					vals[j]=vals[j-1];
			}

			keys[i]=key;
			vals[i]=val;

		}

		size++;
	}

	public List<Integer> getKeys(){

		List<Integer> k=new ArrayList<>();
		for(int a:keys){
			k.add(a);
		}

		return k;
	}

	public List<String> getValues(){

		List<String> v=new ArrayList<>();
		for(String a:vals){
			v.add(a);
		}

		return v;
	}

	public int Rank(int a){
		int lo=0;
		int hi=size-1;
		while(lo<=hi){
			int mid=lo+(hi-lo)/2;
			if(keys[mid]>a) hi=mid-1;
			else if(keys[mid]<a) lo=mid+1;
			else return mid;
		}

		return lo;
	}




}