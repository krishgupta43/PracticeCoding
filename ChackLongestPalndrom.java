package Problems;

public class ChackLongestPalndrom {
	public static void main(String[] args) {
		String s="aababac";
		String s1= check(s);
		System.out.println(s1);
	}

	private static String check(String s) {
		
		if(s==null || s.length()<2)return s;
		int start=0,end=0;
		for(int i=0;i<s.length();i++) {
			int len1=expandLength(s,i,i);
			int len2=expandLength(s,i,i+1);
			int max_length=Math.max(len1, len2);
			
			if(max_length>end-start) {
				start=i-(max_length-1)/2;
				end=i+max_length/2;
			}
			
		}
		return s.substring(start,end+1);
	}

	private static int expandLength(String s, int i, int j) {
		// TODO Auto-generated method stub
		while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)) {
			i--;
			j++;
		}
		return j-i-1;
	}

}
