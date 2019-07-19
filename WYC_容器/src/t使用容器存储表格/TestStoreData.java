package t使用容器存储表格;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * -测试表格数据的存储 <br>
 * ORM思想的简单实验：map表示 一行数据，多行数据表示多个map，将多个map放到List中
 * 
 * @author 王以诚
 */
public class TestStoreData {
	public static void main(String[] args) {
		testCode();
	}

	public static void testCode() {
		Map<String, Object> row1 = new HashMap<>();
		row1.put("id", 1001);
		row1.put("name", "张三");
		row1.put("salary", 20000);
		row1.put("入职日期", "2018.05.05");

		Map<String, Object> row2 = new HashMap<>();
		row2.put("id", 1002);
		row2.put("name", "李四");
		row2.put("salary", 30000);
		row2.put("入职日期", "2005.04.04");

		Map<String, Object> row3 = new HashMap<>();
		row3.put("id", 1003);
		row3.put("name", "王五");
		row3.put("salary", 3000);
		row3.put("入职日期", "2020.05.04");

		List<Map<String, Object>> table1 = new ArrayList<>();
		table1.add(row1);
		table1.add(row2);
		table1.add(row3);

		for (Map<String, Object> row : table1) {
			Set<String> keySet = row.keySet();
			for (String key : keySet) {
				System.out.println(key + ":" + row.get(key));
			}
			System.out.println();
		}
	}
}
