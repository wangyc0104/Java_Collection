package zz一些乱七八糟的代码;

import java.util.ArrayList;
import java.util.List;

public class Choose2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("str1");
		list.add(2, "str2");
		String s = list.get(1);
		System.out.println(s);
	}
}
