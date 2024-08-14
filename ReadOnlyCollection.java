package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//-read only collection is a collection which can not be modified once created.
//Read only-> we can't Add,Remove,Update
public class ReadOnlyCollection {
	public static void main(String[] args) {
		List<String>li=new ArrayList<String>();
		li.add("a");
		li.add("b");
		li.add("c");
		li.add("d");
		
		List<String>li_1=Collections.unmodifiableList(li);
		System.out.println(li_1);
		li.add("i");
		li_1.remove("b");
	}
//Error Exception in thread "main" java.lang.UnsupportedOperationException
}
