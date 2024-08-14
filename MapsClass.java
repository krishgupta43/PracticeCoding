package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapsClass {
	public static void main(String[] args)throws InterruptedException {
		//syn- hash map-does allow null key value
	   Map<Integer,String>shm=Collections.synchronizedMap(new HashMap<Integer,String>());
	   try {
		   shm.put(null, null);
			
		}catch (Exception e) {
			System.out.println("error in Suynchronized map");
		}

	   
	   //concurrent hash map-does not allow null key value
	   ConcurrentHashMap<Integer,String>chm=new ConcurrentHashMap<Integer,String>();
			try {   
				chm.put(null, null);
			
			}catch (Exception e) {
				System.out.println("error in concurreent");
			}

	}
	

}
