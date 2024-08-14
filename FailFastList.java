package Collection;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastList {
	public static void main(String[] args) {
//		List<String>li=new ArrayList<>();
		List<String>li=new CopyOnWriteArrayList<String>();
		li.add("a");
		li.add("b");
		
		Iterator<String>itrator=li.iterator();
		
		while(itrator.hasNext()) {
			String element=itrator.next();
			System.out.println(element);
			li.add("c");
			
		}
		System.out.println(li);
		
	}

}
