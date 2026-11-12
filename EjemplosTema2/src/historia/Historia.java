package historia;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Historia {
	public static void main(String[] args) {
		List<Integer> lis = new ArrayList<Integer>();
		System.out.println(lis);
		lis.add(7);lis.add(3);lis.add(10);
		System.out.println(lis);
		
		
//		Integer suma=0;
//		for (int i = 0; i < lis.size(); i++) {
//			suma+= lis.get(i);			
//		}
//		System.out.println(suma);
//		
//		Integer suma2=0;
//		for (Integer e:lis) {
//			suma2+= e;			
//		}
//		System.out.println(suma2);
		
//		System.out.println(lis.stream().mapToInt(e->e*e).sum());
		Integer suma=0;
		Iterator<Integer> it= lis.iterator();
		while (it.hasNext()) {
			Integer e = it.next();
			suma+=e;
		}
		System.out.println(suma);
	}

}
