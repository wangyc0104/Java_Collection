package h介绍Map接口;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试HashMap的使用
 * 
 * @author 王以诚
 */
public class TestMap {
	public static void main(String[] args) {
		practiceCode();
	}

	public static void testCode() {
		// map的基本使用
		Map<Integer, String> m1 = new HashMap<>();// 键的类型和值的类型是任意的
		m1.put(1, "one"); // put会根据定义的泛型限定参数的类型
		m1.put(2, "two");
		m1.put(3, "three");
		Map<Integer, String> m2 = new HashMap<>();
		m2.put(4, "四");
		m2.put(5, "五");
		System.out.println("m1.get(1): " + m1.get(1)); // get会根据定义的泛型限定参数的类型
		System.out.println("m1.isEmpty(): " + m1.isEmpty() + "");
		System.out.println("m1.containsKey(1): " + m1.containsKey(1) + "");
		System.out.println("m1.containsValue(\"one\"): " + m1.containsValue("one") + "");

		System.out.print("m1.putAll(m2): ");
		m1.putAll(m2);
		System.out.println(m1);

		System.out.println("m1.size(): " + m1.size() + "\n");

		// map中的键不能重复，新值会覆盖旧值
		System.out.println(m1);
		System.out.println("m1.put(3, \"三\");");
		m1.put(3, "三");
		System.out.println(m1);
	}

	public static void practiceCode() {
		Map<Integer, Object> map1 = new HashMap<>();
		map1.put(1, 1000);
		map1.put(2, 2000);
		map1.put(3, 3000);
		map1.put(4, 4000);
		map1.put(5, 5000);

		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "one");
		map2.put(2, "two");
		map2.put(3, "three");
		map2.put(4, "four");
		map2.put(5, "five");

		// 练习
		map1.putAll(map2);
		System.out.println(map1);
		System.out.println(map2);
	}
}
