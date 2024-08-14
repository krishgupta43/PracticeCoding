package Collection;

import java.util.ArrayList;
import java.util.List;

//Declaring a loist fields with the final keyword?
public class FinalList {
	public static void main(String[] args) {
		final List<Integer>li=new ArrayList<>();
		li.add(1);
		li.add(2);
		
		
		System.out.println(li);
		
		li.add(4);
		System.out.println(li);  // modifying possible in list, set case  but reassign not possible
		
		//li=new ArrayList<Integer>();  //not re-intislisetion possible
		
		
//		final Integer a=10;
//		a=23;
		
	}

}
