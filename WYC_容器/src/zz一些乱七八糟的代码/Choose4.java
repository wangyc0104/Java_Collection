package zz一些乱七八糟的代码;

import java.util.HashMap;
import java.util.Map;

public class Choose4 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		String s = "code";
		map.put(s, "1");
		map.put(s, "2");
		System.out.println(map.size());
	}
}
