package c测试Collection方法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yicheng Wang
 */
public class TestCollection2 {
	public static void main(String[] args) {
		test02();
		practiceCode();
	}

	public static void test01() {

	}

	public static void test02() {

		List<String> list01 = new ArrayList<>();
		list01.add("aa");
		list01.add("bb");
		list01.add("cc");

		List<String> list02 = new ArrayList<>();
		list02.add("aa");
		list02.add("dd");
		list02.add("ee");

		System.out.println("list01: " + list01);
		System.out.println("list02: " + list02);
		System.out.println("list01.contains(list02): " + list01.contains(list02));

		// list01.addAll(list02);
		// list01.removeAll(list02); // 删除两个集合的交集：把list01和list02相同的部分删掉
		list01.retainAll(list02); // 取交集：把list01和list02中相同的部分留下

		System.out.println("list01: " + list01);

	}

	public static void practiceCode() {
		List<String> list01 = new ArrayList<>();
		list01.add("aa");
		list01.add("bb");
		list01.add("cc");

		List<String> list02 = new ArrayList<>();
		list02.add("aa");
		list02.add("dd");
		list02.add("ee");

		Object[] obj = list01.toArray();
		System.out.println(obj);
	}
}
