package s工具类Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections辅助类的使用 Collections是一个工具类，Collection是集合的一个接口
 * 
 * @author 王以诚
 */
public class TestCollections {
	public static void main(String[] args) {
		testCode();
	}

	public static void testCode() {
		// 随机排列List
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf((char) ('A' + i)));
		}
		System.out.println(list);

		Collections.shuffle(list); // 随机排列list中的元素
		System.out.println(list);

		Collections.reverse(list); // 逆序排列list
		System.out.println(list);

		Collections.sort(list); // 对list进行排序
		System.out.println(list);

		System.out.println(Collections.binarySearch(list, "C")); // 对某元素进行二分查找
		System.out.println(Collections.binarySearch(list, "Z")); // 对某元素进行二分查找
	}
}
