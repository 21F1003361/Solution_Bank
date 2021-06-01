import java.lang.Math;
public class SolutionLeet1880{
	public static void main(String[] args) {
		
		System.out.println(getnum("abcd"));
	}

	private static int getnum(String s){
        int a=(int)'a';
        int sum=0;
        for(int i=s.length()-1,j=0;i>=0;i--,j++){
            sum+=(s.charAt(i)- 'a') * (Math.pow(10,j));
        }
        return sum;
    }
}