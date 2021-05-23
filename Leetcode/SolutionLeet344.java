public class SolutionLeet344{

	public static void main(String[] args) {
		
		String a="Hello";
		reverseString(a.toCharArray());
	}

	public static void reverseString(char[] s) {

		for(int i=0;i<(s.length-1)/2;i++){

			swap(s,i,s.length-1-i);
		}

		System.out.println(s);

        
    }

    private static void swap(char[] s,int i,int j){
    	char temp=s[i];
    	s[i]=s[j];
    	s[j]=temp;
    	//System.out.println(s);
    }
}