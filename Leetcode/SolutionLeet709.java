class Solution {
    public String toLowerCase(String s) {
        
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            
            if((int)sb.charAt(i)>=65 && (int)sb.charAt(i)<=90)
                sb.setCharAt(i,(char)((int)sb.charAt(i)+32));
            
            
        }
        return sb.toString();
    }
}