package functions;

import java.util.ArrayList;

public class FunctionsCollection {
	private ArrayList<Function> list;
	
	public FunctionsCollection() {
		list = new ArrayList<>();
	}
	
	public void add(Function fct) {
		list.add(fct);
	}
	
	public ArrayList<Integer> getCollectionResult(int number) {
		ArrayList<Integer> res = new ArrayList<>();
		for (Function fct : list) {
			res.add(fct.apply(number));
		}	
		return res;		
	}
}
