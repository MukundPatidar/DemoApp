package LeetCode;

import java.util.*;

public class _temp {
	public static void main(String args[]) {
		HashMap<Integer, List<Integer>> myHashMap = new HashMap<>();

		myHashMap.put(10, new ArrayList<>()).add(1);
		myHashMap.put(10, new ArrayList<>()).add(10);
		myHashMap.put(101, new ArrayList<>()).add(1);
		myHashMap.put(1, new ArrayList<>()).add(1);
		System.out.println(myHashMap);
	}
}
