package Problems;

//Given a string s, find the length of the longest substring without repeating characters.
//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
// 
//
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
// 
//Example 3:
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3

public class Problem_3 {

	public static void main(String[] args) {
		String str = "abcdabcbbacfg";
		int res = check(str);
		System.out.println(res);

	}
  private static int check(String str) {
		String ans = "";
		int max_length = -1;
		if (str.isEmpty())return 0;
		else if (str.length() == 1)return 1;

		for (char c : str.toCharArray()) {
			String str_1 = String.valueOf(c);

			if (ans.contains(str_1)) {
				ans = ans.substring(ans.indexOf(str_1) + 1);
			}
			ans = ans + String.valueOf(c);
			max_length = Math.max(ans.length(), max_length);

		}

		return max_length;

	}

}
