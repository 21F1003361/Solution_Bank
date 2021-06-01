public class SolutionLeet1180{

	public static void main(String[] args) {
		
		System.out.println(countLetters("aaaba"));
	}

	 public static int countLetters(String s) {
        
        int i=0,j=0,count=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                j++;
                //count++;
            }
            else{
            	int n=j-i;
            	count+=(n * (n+1))/2;
                i=j;
                j++;
            }
            if(j==s.length()){
            	int n1=j-i;
            	count+=(n1 * (n1+1))/2;
            }
            
            
        }
        
        return count;
    }
}