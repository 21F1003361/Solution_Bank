import java.util.*;
public class SolutionLeet150{
    public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<>();
        int a=0,b=0;
        for(String s:tokens){
            //System.out.println(st);
            switch (s){
                case "+":
                    a=Integer.parseInt(st.pop());
                    b=Integer.parseInt(st.pop());
                    st.push(String.valueOf(a+b));
                    break;
                case "-":
                    a=Integer.parseInt(st.pop());
                    b=Integer.parseInt(st.pop());
                    st.push(String.valueOf(b-a));
                    break;
                
                case "*":
                    a=Integer.parseInt(st.pop());
                    b=Integer.parseInt(st.pop());
                    st.push(String.valueOf(a*b));
                    break;
                case "/":
                    a=Integer.parseInt(st.pop());
                    b=Integer.parseInt(st.pop());
                    st.push(String.valueOf(b/a));
                    break;
                
                default:
                    st.push(s);
              
                
            }
        }
        String result=st.pop();
        return Integer.parseInt(result);
    }
}