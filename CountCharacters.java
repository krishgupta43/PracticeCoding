package com.study;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountCharacters {
	static final int SIZE = 26;

	public static void main(String[] args) {
		String str = "helloworldhello";
		int[] freq = new int[SIZE];
		int n = str.length();

		for (int i = 0; i < n; i++)
			freq[str.charAt(i) - 'a']++;

		for (int i = 0; i < n; i++)
			if (freq[str.charAt(i) - 'a'] != 0) {
				System.out.print(str.charAt(i) + "->");
				System.out.print(freq[str.charAt(i) - 'a'] + " ");
				freq[str.charAt(i) - 'a'] = 0;

			}
		System.out.println("-----------using Java 8------------");
		String str_1 = "helloworldhello";
		
		System.out.println(str_1.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		System.out.println(Arrays.stream(str_1.split("")).collect(Collectors.groupingBy(x->x,Collectors.counting())));
	}

}
