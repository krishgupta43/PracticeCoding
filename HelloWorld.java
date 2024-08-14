package com.study;

import java.util.Map;
import java.util.stream.Collectors;

public class HelloWorld {

	public static void main(String[] args) {
		String str="krishna Gupta";
		String[] arr=str.split("\\s+");
		int n=arr.length;
		StringBuffer sb=new StringBuffer();
		
		for(int i=n-1;i>=0;i--) {
			sb.append(arr[i]+" ");
		}
		
		System.out.println(sb.toString().trim());
		
		System.out.println(str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x,Collectors.counting())));
		

	}

}
