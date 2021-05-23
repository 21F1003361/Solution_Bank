import java.util.*;

public class SolutionLeet843{

	private static final int wordlength=6;
	private static int guesscount=0;
	public static String[] masterlist;
	public static String secret;
	public static void main(String[] args) {

		//wordlength=6;

		String[] wordlist={"wichbx","oahwep","tpulot","eqznzs","vvmplb","eywinm","dqefpt","kmjmxr","ihkovg","trbzyb","xqulhc","bcsbfw","rwzslk","abpjhw","mpubps","viyzbc","kodlta","ckfzjh","phuepp","rokoro","nxcwmo","awvqlr","uooeon","hhfuzz","sajxgr","oxgaix","fnugyu","lkxwru","mhtrvb","xxonmg","tqxlbr","euxtzg","tjwvad","uslult","rtjosi","hsygda","vyuica","mbnagm","uinqur","pikenp","szgupv","qpxmsw","vunxdn","jahhfn","kmbeok","biywow","yvgwho","hwzodo","loffxk","xavzqd","vwzpfe","uairjw","itufkt","kaklud","jjinfa","kqbttl","zocgux","ucwjig","meesxb","uysfyc","kdfvtw","vizxrv","rpbdjh","wynohw","lhqxvx","kaadty","dxxwut","vjtskm","yrdswc","byzjxm","jeomdc","saevda","himevi","ydltnu","wrrpoc","khuopg","ooxarg","vcvfry","thaawc","bssybb","ccoyyo","ajcwbj","arwfnl","nafmtm","xoaumd","vbejda","kaefne","swcrkh","reeyhj","vmcwaf","chxitv","qkwjna","vklpkp","xfnayl","ktgmfn","xrmzzm","fgtuki","zcffuv","srxuus","pydgmq"};
		
		masterlist=wordlist;
		secret="ccoyyo";

		findSecretWord(wordlist);
		//System.out.println(guess("aaaazz"));


		
	}

	public static void findSecretWord(String[] wordlist) {


		for(int i=0;i<wordlist.length;i++){
			//System.out.println(Arrays.toString(wordlist));

			int response=guess(wordlist[i]);
			System.out.println("res "+response);
			if(response==6) return;
			List<String> updated_wordList=new ArrayList<>();
			for(String a:wordlist){
				if(!a.equals(wordlist[i]) && !(matchscore(a,wordlist[i])<response)) updated_wordList.add(a);
			}
			System.out.println(updated_wordList.size());
			wordlist=new String[updated_wordList.size()];
			wordlist=updated_wordList.toArray(wordlist);
			i=-1;
		}


        
    }

    private static int guess(String a){
    	System.out.println("gscnt "+(++guesscount));
    	if(a.equals(secret)) {
    		System.out.println("Test case passed");
    		return 6;
    	}
    	return matchscore(a,secret);


    }

    private static int matchscore(String a,String b){
    	//System.out.println(a+" "+b);
    	int count=0;
    	for(int i=0;i<wordlength;i++){
    		count+= (a.charAt(i)==b.charAt(i))?1:0;
    	}

    	return count==0?-1:count;
    }
}