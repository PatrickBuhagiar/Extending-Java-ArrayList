import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Operation<T, U> extends ArrayList<T>{
	
	//Map function. Accepts a function with outputs and inputs of the same type 
	List<T> map(Function<T,T> f, List<T> list){
		List<T> mapped = new ArrayList<T>();
		//create Iterator
		Iterator<T> it = list.iterator();
		while(it.hasNext()){
			//uses the function on each list element and adds it to the list mapped
			mapped.add(f.apply(it.next()));
		}
		return mapped;	
	}
	
	//filter function. Accepts a function of type Boolean
	List<T> filter(Function<T,Boolean> f, List<T> list){
		List<T> filtered = new ArrayList<T>();
		for (int i =0; i<list.size(); i++){
			//Iterates each element and adds to the filtered list if it satisfies the function
			if(f.apply(list.get(i))==true){
				filtered.add(list.get(i));
			}
		}
		return filtered;	
	}
	
	//forAll function. Accepts a function of type Boolean
	boolean forAll(Function<T,Boolean> f, List<T> list){
		boolean res = true;
		//create Iterator
		Iterator<T> it = list.iterator();
		//Iterates the list. On the first occasion that an element does not satisfy the function, res is set to false.
		while(it.hasNext()){
			if (f.apply(it.next())==false){
				res = false;
			}
		}
		return res;
	}
	
	//Any (there exists) function. Accepts a function of type Boolean
	boolean any(Function<T,Boolean> f, List<T> list){
		boolean res = false;
		//create Iterator
		Iterator<T> it = list.iterator();
		//Iterates the list. On the first occasion that an element satisfies the function, res is set to true
		while(it.hasNext()){
			if (f.apply(it.next())==true){
				res = true;
			}
		}
		return res;
	}
}
