package com.study;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateCharacters {
	public static void main(String[] args) {
		String str="ilovejavateche";
		String[] arr=str.split("");
		
		System.out.println("normal String");
		System.out.println(str);
		
		System.out.println("Print Duplicate Characters using Java 8 features using Split String");
        System.out.println(Arrays.stream(str.split("")).collect(Collectors.groupingBy(x->x,Collectors.counting()))
		  .entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).collect(Collectors.toList()));	
        
        System.out.println("Pring Duplicate Characters using Java 8 features w/o Split String");
        System.out.println(str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x,Collectors.counting())).entrySet().stream()
                .filter(x->x.getValue()>1).map(x->x.getKey()).collect(Collectors.toList()));
        
        System.out.println("Pring Unique Characters using Java 8 features using Split String");
        System.out.println(Arrays.stream(str.split("")).collect(Collectors.groupingBy(x->x,Collectors.counting()))
		  .entrySet().stream().filter(x->x.getValue()==1).map(x->x.getKey()).collect(Collectors.toList()));
        
        System.out.println("Remove Duplicate characters");
        
        System.out.println(Arrays.stream(str.split("")).distinct().collect(Collectors.toList()));	
        
        List<Integer>li=Arrays.asList(9,2,3,4,2,3);
        System.out.println("Remove Deplicate Elements");
        li.stream().distinct().collect(Collectors.toList()).forEach(x->System.out.print(x+" "));
        
        li.stream().filter(x->x>4).forEach(x->System.out.println(x+" "));
        li.stream().map(i->i*i).forEach(x->System.out.print(x+" "));
        
	}
	


}
