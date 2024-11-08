package LeetCode;

import java.util.Hashtable;

public class _temp {
	public static void main(String args[]) {
		StringBuilder str = new StringBuilder("ab*cd*");
		System.out.println(str+" "+str.length());
		
		Hashtable<Integer,Character> table = new Hashtable<>();

		while (str.toString().contains("*")) {
			table.put((str.indexOf("*")-1), str.charAt(str.indexOf("*")-1));
			str.deleteCharAt(str.indexOf("*"));
		}
		
		System.out.println(str+" "+str.length());
		System.out.println(table);
		System.out.println(table.get(3));
		System.out.println(table);
	}
}
