package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//Given an array of strings strs , group the anagrams together. You can return the answer in any order.
//		Given an array of strings strs , group the anagrams together. You can return the answer in any order.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
public class Problem_1 {

	private static void check(String[] str) {
		HashMap<String, List<String>> mp = new HashMap<>();
		for (int i = 0; i < str.length; i++) {
			String w = str[i];
			char[] ch = w.toCharArray();
			Arrays.sort(ch);
			String strnew = new String(ch);

			if (mp.containsKey(strnew)) {
				mp.get(strnew).add(w);
			} else {
				List<String> words = new ArrayList<>();
				words.add(w);
				mp.put(strnew, words);
			}
		}

		for (String s : mp.keySet()) {
			List<String> ans = mp.get(s);
			if (ans.size() >= 1) {
				System.out.println(ans);
			}

		}

	}
    public static void main(String[] args) {
		String[] str = { "Eat", "tea", "tan", "ate", "nat", "bat" };
        check(str);
	}

}
