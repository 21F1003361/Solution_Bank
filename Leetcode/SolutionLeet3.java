import static java.lang.Math.max;
public class SolutionLeet3{

	public static void main(String[] args) {
		
		int a=lengthOfLongestSubstring("aab");
		System.out.println(a);
	}

	public static int lengthOfLongestSubstring(String s) {

		return helper(s,0);
        
    }

    private static int helper (String s,int pos){

    	if(pos==s.length()) return 0;

    	String sub=s.substring(pos,s.length());

    	//System.out.println(sub+" "+pos);

    	int cnt=0;

		for(int i=0;i<sub.length();i++){
			

			int first_occurance=sub.indexOf(sub.charAt(i));
			int curr=i;

			//System.out.println("fo"+first_occurance+" "+curr);
			if(first_occurance < curr){

				cnt=max(cnt,helper(sub,first_occurance+1));
				break;
			}
			else{
				cnt++;
			}

		}

		return cnt;

    }


}