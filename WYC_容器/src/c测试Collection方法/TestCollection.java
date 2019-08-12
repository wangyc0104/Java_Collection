package c测试Collection方法;

import java.util.*;

/**
 * 测试Collection接口中的方法
 * 
 * @author 王以诚
 */
public class TestCollection {
	public static void main(String[] args) {
		testCode();
		practiceCode();
	}

	public static void testCode() {
		Collection<String> c = new ArrayList<>();
		c.size(); // 返回元素数目
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		c.add("王老大");
		c.add("王老中");
		c.add("王老小");
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		System.out.println(c);
		System.out.println(c.contains("王老大")); // true

		Object[] objs = c.toArray();
		System.out.println(objs);

		// Collection中存的是String对象的引用地址
		// remove只是删除了String对象的地址，并没有删除对象
		// 常量池中的对象会在垃圾回收的时候被处理（如果有必要的话）
		// 事实上，方法区的垃圾回收效果并不尽人意思啊~~~
		c.remove("王老中");
		System.out.println(c);
	}

	public static void practiceCode() {
		Collection<Integer> a = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			a.add(i);
		}
		Collection<Integer> b = new ArrayList<>();
	}
}
