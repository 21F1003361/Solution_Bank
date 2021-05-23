import java.util.*;
public class SolutionLeet734{

	public static void main(String[] args) {
		
		String[] s1={"I","AM","SOUVIK"};
		String[] s2={"I","AM","MEGHA"};
		List<String> l1=List.of("MEGHA","SOUVIK");
		List<List<String>> similarPairs=new ArrayList<>();
		similarPairs.add(l1);
		System.out.println(areSentencesSimilar(s1,s2,similarPairs));

	}

	public static boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        
    if(sentence1.length != sentence2.length) return false;
        Map<String,Set<String>> table=new HashMap<>();
        for(List pair:similarPairs){
            Set<String> similarwords;
            if(table.containsKey((String)pair.get(0))){
                similarwords=table.get((String)pair.get(0));
                similarwords.add((String)pair.get(1));
                //System.out.println(similarwords);
            }
        	else{
                similarwords=new HashSet<>();
                similarwords.add((String)pair.get(1));
                table.put((String)pair.get(0),similarwords);
                //System.out.println(similarwords);
            }
            if(table.containsKey((String)pair.get(1))){
                similarwords=table.get((String)pair.get(1));
                similarwords.add((String)pair.get(0));
                //System.out.println(similarwords);
            }
        	else{
                similarwords=new HashSet<>();
                similarwords.add((String)pair.get(0));
                table.put((String)pair.get(1),similarwords);
                //System.out.println(similarwords);
            }
                
        	//table.put((String)pair.get(1),(String)pair.get(0));
        }

        for(int i=0;i<sentence2.length;i++){
        	if(!sentence1[i].equals(sentence2[i]) && !table.getOrDefault(sentence1[i],new HashSet<String>()).contains(sentence2[i]))
        		return false;

        }
        return true;
        
    }
}