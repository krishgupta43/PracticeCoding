package Collection;

import java.util.ArrayList;


//How can i write Custom Arrraylist where I don't want to allow duplicate element
public class CustomArrayList extends ArrayList{
	
	@Override
	public boolean add(Object o) {
		if(this.contains(o))
			return true;
		else
			return super.add(o);
    }
	
	public static void main(String[] args) {
		
		CustomArrayList li=new CustomArrayList();
		li.add(1);
		li.add(1);
		li.add(1);
		li.add(2);
		System.out.println(li);
		
	}

}
