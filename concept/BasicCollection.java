import java.util.*;
import java.util.function.Predicate;
public class BasicCollection{
	public static void main(String[] args) {
		

		/*

			Dynamic Size ,Use Generics (arrays does not support generic) , thread safe operation, iteration, Some collection classes like ArrayList & Hashset uses Arrays in underlying implementation


			Iterable (Interface that enabled foreach for a class which impplements)
			  Collection (Interface that enabled add , remove, it extends Iterable interface)
			    List (Interface which enabled int indexed collection)
			     ArrayList (class which implemented List)
			    Set (Interface which enablesnset set of unique element in a collection)
			     HashSet (Class that implement Set interface)
                 SortedSet (Inteface which enabled ordering capability in Set)
                  Treeset (Class Implementation)
                Deque (Inteface for double ended queue gived FIFO & LIFO)
                 ArrayDeque (Class Imple of dequeu)
            Map (Interface for unique key and collection of val)
             HashMap (class that implements Map)


			ArrayList no arg construc created an arrayList with size 10 , but its auto resizable
			List<T> list=ArrayList<T>();
			It can also be created with specific size 
			List<T> list=ArrayList<T>(25);
			ArrayList can also be initialized from another collection
			fixedsizedList can be created using var arg Arrays.asList(p1,p2,p3,p4);  //vararg accepts dynamic number of param or arrat
			read only list can be created using List.of(p1,p2);
			List main ops =>1.Insert (add) 2.update (set) 3.Delete (remove: remove has two overloaded method one with index and another is woth the object which is to be removed)
			4.getIndex (indexOf()) 5.contains(Object o) 6.Size
			List method returns boolean value to indicate the operation success , example if we try to remove an element which does not exist it will return false


			HashSet implementation of Set
			No arg constructor created a Set with 16 elements
			Constructor with default capacity and load facotr(0.75 default)
			Can be created from another coll.
			Read onu Set.of("A","B")l
			When number of element exceeds product of capacity and load facotr table is rehashed so that hashtable has twice the number of buckets
			List allows duplicate but set does not, when set is init from list, dup elem gets removed automatically
			Method add(T),remove(T), contains(T) add.remove checks duplicate using equals method
			set method returns boolean value to indicate the operation success 
			It may support one null value (need to be tested)


			ArrayDeque is implementation of Deque interface , 16 default capacity ,other collection cal be used to init
			Methods 1) offerFirst(T) (add in head) 2)offerLast(T)  add at tail
			        3.pollFirst (remove head)    4,pollLast(remove tail)
			        5.peekFirst   peekLast  (fetch without removing)
			 Null values not allowed , if Deque is null poll peek return null


			 Map is interface which is a combo of Set and collection, its awrapper for key value pair , default capacity is 16
			 set initial capacity and load facotr is 0.75
			 Method of is overloaded upto 10 map entries
			 HashMap methods put(k,v) ,remove(k) ,get(k),containsKey(k),containsValue(v);raplce(k)/replace(k,v) <- alternate to put
			 Null Key is allowed just once, Null values are allowed.
			 DuplicateKeys can not be added , it overwrites and returns the old value , null if inserting first time
			 getOrDefault(Object key, V defaultValue)
			Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
			public V putIfAbsent(K key,
                     V value)
			Description copied from interface: Map
			If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the current value.
			keySet() , values()


			Collection implements iterable due to which it can be directly used in forEach loop , otherwise we can get iterator, iterator allows remove()
			Collection can be converted to array using toArray()
			removes element based on predicate interface

			java.util.Collections class provides below useful methods
				1.filling collection with values
				2.binarysearch (using comaparable of the collection object or comparator)
				3.revese
				4.shuffle
				5.sort

			Collections thread safety can be at two level , 1. collection level (add , remove element)  2.Object / element level
			Thread safety can be ensure by
			    a.Unmodifiable (Fast but read only)
			    b.Synchronized (Slow and unscalable)
			    c.Copy on Write (fast but consumes memory)


		*/
			Set<String> set=new HashSet<>();
			set.add("Souvik");
			set.add("Megha");
			set.add("Samriddhi");
			List<String> list=new ArrayList<String>(set);
			System.out.println(list);
			List<String> l1=Arrays.asList(new String[]{"a","b"});
			//l1.add("c");   not supported   fixed list
			l1.set(0,"c"); //not readonly
			System.out.println(l1);
			List<String> l2=List.of("a","b","c","d");
			//l2.add("a`1");   not supported   read only
			//l2.set(0,"c"); //not supported because readonly
			System.out.println(l2);


			Set<Integer> set1=Set.of(1,11,12);  //duplicate ele not allowed
			System.out.println(set1);

			for(int a:set1)   //collection iteration using forEach
				System.out.println(a);

			Iterator it=set1.iterator();
			while(it.hasNext())    //using iterator
				System.out.println(it.next());

			class TestPredicate implements Predicate<String>{
				public boolean test(String a){

					if(a.length()==5) return false;
					else return true;

				}

			}

			set.removeIf(new TestPredicate());
			System.out.println(set);


	}
}