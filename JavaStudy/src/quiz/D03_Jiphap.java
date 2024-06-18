package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class D03_Jiphap {

	public static void main(String[] args) {
		
		ArrayList<Object> col1 = new ArrayList<Object>();
		ArrayList<Object> col2 = new ArrayList<>();
		col1.add(1);
		col1.add(2);
		col1.add(3);
		
		col2.add(2);
		col2.add(3);
		col2.add(4);
		col2.add(5);
		
		System.out.println(union(col1, col2));
		System.out.println(getIntersection(col1, col2));
		System.out.println(getDiff(col1, col2));
		
	}
	
	public static Set<Object> union(Collection<Object> col1, Collection<Object> col2) {
		Set<Object> result = new HashSet<>(col1); 
		
		result.addAll(col2);
		
		return result;
	}
	
	public static Set<Object> getIntersection(Collection<Object> col1, Collection<Object> col2) {
		Set<Object> result = new HashSet<>(col1);
		
		result.retainAll(col2);
		
		return result;
	}
	
	public static Set<Object> getDiff(Collection<Object> col1, Collection<Object> col2) {
		Set<Object> result = new HashSet<>(col1);
		
		result.removeAll(col2);
		
		return result;
	}
}
