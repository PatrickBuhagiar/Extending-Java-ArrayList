
import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args){
		//create List with 100 numbers
		List<Integer> list = new ArrayList<Integer>();
		for (int i=1; i<101;i++){
			list.add(i);
		}
		
		//Create instance of Operation
		Operation<Integer,Integer> o = new Operation<Integer,Integer>();
		
		//create instance of Functions
		DoubleOP f = new DoubleOP();
		isEven e = new isEven();
		
		//Print original list
		System.out.print(" List:: ");
		printList(list);
		
		//Map Double function
		System.out.print("\n Map: ");
		printList(o.map(f, list));
		
		//Filter list with isEven Function
		System.out.print("\n Filter: ");
		printList(o.filter(e, list));
		
		//ForAll list with isEven function
		System.out.println("\n ForAll: "+ o.forAll(e, list));
		
		//Any list with isEven function
		System.out.println(" Any: "+ o.any(e, list));		
	}
	
	//Function to print list
	static void printList(List<Integer> list){
		for (int i =0;i<list.size();i++){
			System.out.print(list.get(i) + " ");
		}
	}

}

