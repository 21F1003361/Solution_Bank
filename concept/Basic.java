import java.util.*;
public class Basic{
	public static void main(String[] args) {
		
		/***************   Array   **************
			

		Array is a fixed block of memory of same type , It can be initialized 3 ways , when we create an array initially object array has null and primitive has 0 , if boolean then false

		MultiDimensional array can be decalred as int[][] matrix=new int[3][3]; can be non square matrix, can be more than 2D



		*/

		int[] arr=new int[6];  // one way to initialize   it can alse be like int arr[]
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;


		int[] arr1=new int[] {1,2,3}; //2nd way

		int[] arr2={1,2,3};  //3rd way

		/**********************  Array Copy can be done 3 ways *********************/



		System.arraycopy(arr1,0,arr,3,2) ;//source array , source pos, desti array, desti pos,legth of arr to be copied

		int[] copiedarr=Arrays.copyOf(arr,10);   // 2nd way , can be useful for resize

		int[] copiedarr2=Arrays.copyOfRange(arr,0,2);  //start pos in inclusive but end pos is exclusing , this is 3rd way to copy arr, good for partial copy

		/* Arrays.copyOf & Arrays.copyOfRange is overloaded with all primitives and also work with generics */

		System.out.println(Arrays.toString(copiedarr2));

		/** Java.util.Arrays class provides easy implementation for filling array element , search, compare , sort (a.using Comparable as implemented by Objects within array,
		b.Comparator interface)              *********************/

		String[] names1={"Samriddhi","Souvik","Megha"};
		String[] names2={"Samriddhi","Souvik","Megha","Punting"};
		System.out.println(names2.equals(names1));

		Arrays.sort(names1);
		System.out.println(Arrays.toString(names1));

		class lengthcompare implements Comparator<String>{

			public int compare(String s1,String s2){
				if(s1.length()<s2.length()) return -1;
				else if(s1.length()>s2.length()) return 1;
				else return 0;
			}
		}

		Arrays.sort(names2,new lengthcompare());
		System.out.println(Arrays.toString(names2));


		/*****  Loops  -> While; Do while; For.Foreach ===> do while ensures that the loop executes atleast once , for loop structure in initializer, termination cond , increment/dec ***///


		/*** Complex for loop => the positional nature of for loop enabled it to define multiple iterator , blank body and action can be embedded in iterator section , but not recommended ***''****/

		for(int i=0,j=0;i+j<5;i++,j++,System.out.println(i+j)){
			//not recommedned to combine iteraotr logic with loop logic

		}

		/*********** Break & Continue ******************/
		/*

		continue skips the current (rest of the ) execution and goe to next 
		continue <label> skips the labelded loop cycle
		break breaks the current loop
		break <label> terminates the labeled loop

		*/

	}
}