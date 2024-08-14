package com.study;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWords {
	public static void main(String[] args) {
		String str="my name is name my krishna";
		String[] Arr=str.split(" ");
		
		HashMap<String, Integer>mp=new HashMap<>();
		for(int i=0;i<Arr.length;i++) {
			if(mp.containsKey(Arr[i])) {
				int count=mp.get(Arr[i]);
				mp.put(Arr[i], count+1);
			}
			else {
				mp.put(Arr[i], 1);
			}
		}
		
		System.out.println(mp);
		
		
		System.out.println("-----------Using Java 8 Fetures-------------");
		System.out.println(Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting())));
		
//		for(Map.Entry<String, Integer>entry:mp.entrySet()) {
//		if(entry.getValue()>1) {
//			System.out.println(entry.getKey()+" "+entry.getValue()+" ");
//		}
//	}

		
		
        List<String> str_1 = Arrays.asList("Zohne", "Redy", "Zohne", "Redy", "Stome");
        Map<String, Long>mp_1=str_1.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(mp_1);
        mp_1.entrySet().stream().filter(x->x.getValue()>1).forEach(x->{
            System.out.println(x.getKey()+"->"+x.getValue());
        });
	
	
//        mp_1.forEach((k,v)->{
//        	if(v==2)
//        	System.out.print(k+ ":"+v+" ");
//        });
//		System.out.println();
		
		
		
		

		
		
//		for(Map.Entry<String, Integer>entry:mp.entrySet()) {
//			System.out.println("Key ="+entry.getKey()+" , Value = "+entry.getValue());
//		}
		
//		mp.entrySet().stream().forEach(x->System.out.println(x.getKey()+"->"+x.getValue()));
	

		
		
	}

}
