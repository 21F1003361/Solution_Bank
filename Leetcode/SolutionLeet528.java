import java.lang.Math;
public class SolutionLeet528{

	static int[] arr;
	int prefixsum;

	public static void main(String[] args) {
		
		//System.out.println((int)(Math.random()*100));

		int[] temp={10,20,30,40,50,60,70};
		arr=temp;
		System.out.println(ceil(15));

		System.out.println((int)'Z');
	}

	public SolutionLeet528(int[] w) {

		arr=w;
		

		for(int i=1;i<arr.length;i++){
			arr[i]=arr[i]+arr[i-1];
		}

		prefixsum=arr[arr.length-1];

        
    }

	public int pickIndex() {
        
        int rand=(int)(Math.random()*prefixsum);
        int result=ceil(rand);
        return result;
    }

    private static int ceil(int a){

    	int lo=0, hi=arr.length-1;

    	while(lo<=hi){
    		int mid=lo+(hi-lo)/2;

    		if(arr[mid]<a) lo=mid+1;
    		else if(arr[mid]>a) hi=mid-1;
    		else return mid;
    	}
    	return lo;
    }
}