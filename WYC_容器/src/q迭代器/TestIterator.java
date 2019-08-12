package q迭代器;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * -测试迭代器List, Set, Map
 * 
 * @author 王以诚
 */
public class TestIterator {
	public static void main(String[] args) {
		testCode();
	}

	public static void testIteratorList() {
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");

		// 使用Iterator遍历List
		for (Iterator<String> iter = list.iterator(); iter.hasNext();) {
			String temp = iter.next();
			System.out.println(temp);
		}
	}

	public static void testIteratorSet() {
		Set<String> set = new HashSet<>();
		set.add("aa");
		set.add("bb");
		set.add("cc");

		// 使用Iterator遍历Set
		for (Iterator<String> iter = set.iterator(); iter.hasNext();) {
			String temp = iter.next();
			System.out.println(temp);
		}
	}

	public static void testIteratorMap1() {
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(100, "aa");
		map1.put(200, "bb");
		map1.put(300, "cc");

		Set<Entry<Integer, String>> ss = map1.entrySet();
		System.out.println("===========迭代Map：Key-Value===========");
		for (Iterator<Entry<Integer, String>> iter = ss.iterator(); iter.hasNext();) {
			Entry temp = iter.next();
			System.out.println(temp.getKey() + "-" + temp.getValue());
		}

	}

	public static void testIteratorMap2() {
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(100, "aa");
		map2.put(200, "bb");
		map2.put(300, "cc");

		Set<Integer> keySet = map2.keySet();
		System.out.println("===========迭代Map：KeySet-Value===========");
		for (Iterator<Integer> iter = keySet.iterator(); iter.hasNext();) {
			Integer key = iter.next();
			System.out.println(key + "-" + map2.get(key));
		}
	}

	public static void testCode() {
		testIteratorList();
		testIteratorSet();
		testIteratorMap1();
		testIteratorMap2();
	}
}
