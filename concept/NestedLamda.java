import java.util.*;
public class NestedLamda{

	private static int a;
	public static class innerstatic{
		innerstatic(){
			System.out.println("inner static initialized "+a);
		}
	}
	public class innermember{
		innermember(){
			System.out.println("inner member "+a);
		}
	}

	public static void main(String[] args) {
		/* 

				********************   Nested Class ***************
				1.Static nested ; 2.member class 3.local class 4.anonymous class














		*/
				a=10;
				NestedLamda.innerstatic in=new NestedLamda.innerstatic();   //inner static class
				NestedLamda.method1();
				NestedLamda nl=new NestedLamda();
				nl.inner();

				String[] arr=new String[]{"abcb","bb","ccc","asjkdsjd","zxs"};
				Arrays.sort(arr,new Comparator<String>(){

					@Override
					public int compare(String a , String b){
						if(a.length()<b.length()) return -1;
						if(a.length()>b.length()) return 1;
						return 0;
					}

				});

				System.out.println(Arrays.toString(arr));

	}

	private static void method1(){
		new innerstatic();

	}
	private innermember inner(){
		class local{
			local(){
				System.out.println("local initialized "+a);
			}
		}
		new local();
		return new innermember();
	}




}