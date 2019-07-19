package d测试List方法;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		// testCode();
		testCode();
	}

	public static void testCode() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list);

		System.out.println("list.add(2, \"我\");");
		list.add(2, "我");
		System.out.println(list);

		System.out.println("list.remove(2);");
		list.remove(2);
		System.out.println(list);

		System.out.println("list.get(2);");
		System.out.println(list.get(2));

		System.out.println("list.indexOf(\"B\")");
		System.out.println(list.indexOf("B"));

		list.add("我");
		list.add("D");
		list.add("C");
		list.add("B");
		list.add("A");
		System.out.println(list);

		System.out.println(list.indexOf("CB"));
		System.out.println(list.indexOf("NOTFOUND"));
	}

	public static void practiceCode() {
		
	}
}
