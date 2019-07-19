package zz一些乱七八糟的代码;

import java.util.HashSet;
import java.util.Set;

public class Choose3 {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("abc");
		s.add("abc");
		s.add("abcd");
		s.add("ABC");
		System.out.println(s.size());
	}
}
