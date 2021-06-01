public class RunLength{
	public static void main(String[] args) {
		
		System.out.println(RunLen("aaaaabbbbcccccddabcd"));
	}

	public static String RunLen(String s){
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<s.length()){
			int j=i;
			while(j<s.length() && s.charAt(i)==s.charAt(j)){
				j++;
				//System.out.println(j);
			}
			sb.append(j-i);
			sb.append(s.charAt(i));
			i=j;
			//System.out.println(sb.toString());
		}
		return sb.toString();
	}
}