import java.util.*;
public class Simplyfy{
	public static void main(String[] args) {
		System.out.println(unzip("a[2[bc2[d]]]e"));
	}

	private static String unzip(String a){
		Stack<Character> st=new Stack<>();
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)==']'){
				char c;
				StringBuilder sb=new StringBuilder();
				do{
					c=st.pop();
					if(c!='[') sb.append(c);
				}while(c!='[');

				if(Character.isDigit(st.peek())){
					int freq=Character.getNumericValue(st.pop());
					String temp=sb.toString();
					while(freq-->1)
						sb.append(temp);
				}
				sb.reverse();
				for(int j=0;j<sb.length();j++)
					st.push(sb.charAt(j));
			}
			else{
				st.push(a.charAt(i));
			}
		}
		StringBuilder res=new StringBuilder();
		while(st.size()>0){
			
			res.append(st.pop());

		}
		return res.reverse().toString();
	}
}