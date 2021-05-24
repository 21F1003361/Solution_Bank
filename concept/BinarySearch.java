public class BinarySearch{

	public static void main(String[] args) {

		int[] arr={1,2,3,4,5,6,7,8} ; // array must be ordered for BinarySearch Ops
		int key=0;
		if(find(arr,key)) System.out.println("Found");
		else System.out.println("Not Found");		
	}

	private static boolean find(int[] a, int k){


		int lo=0;
		int hi=a.length-1;
		

		while(lo<=hi){

			int mid=lo+(hi-lo)/2;
			if(a[mid] > k) hi=mid-1;
			else if(a[mid] < k) lo=mid+1;
			else return true;

		}

		return false;
	}


}