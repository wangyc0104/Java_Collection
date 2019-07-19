package o手动实现一个HashSet;

import java.util.HashMap;
import java.util.Map;

public class MyHashSet {
	HashMap map;

	public static final Object PRESENT = new Object();

	public MyHashSet() {
		map = new HashMap();
	}

	public void add(Object o) {
		map.put(o, PRESENT);
	}

	public void remove(Object o) {
		map.remove(o);
	}

	public int size() {
		return map.size();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (Object key : map.keySet()) {
			sb.append(key + ", ");
		}
		sb.replace(sb.length() - 2, sb.length(), "]");
		return sb.toString();
	}

	public static void main(String[] args) {
		testCode();
	}

	public static void testCode() {
		MyHashSet set = new MyHashSet();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		System.out.println(set);
		set.remove("ccc");
		System.out.println(set);
	}
}
