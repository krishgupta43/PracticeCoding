package com.study;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Krishna Gupta";
		String[] Arr = str.split(" ");
		int n = Arr.length;

		StringBuffer sb = new StringBuffer();

		for (int i = n - 1; i >= 0; i--) {
			sb.append(Arr[i] + " ");
		}

		System.out.println(sb.toString().trim());

	}

}
