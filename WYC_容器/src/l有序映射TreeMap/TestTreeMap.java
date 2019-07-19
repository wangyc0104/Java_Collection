package l有序映射TreeMap;

import java.util.Map;
import java.util.TreeMap;

/**
 * -测试TreeMap的使用
 * 
 * @author 王以诚
 */
public class TestTreeMap {
	public static void main(String[] args) {
		testCode();
	}

	public static void testCode() {
		Map<Integer, String> treemap1 = new TreeMap<>();
		treemap1.put(20, "aa");
		treemap1.put(3, "bb");
		treemap1.put(6, "cc");
		for (Integer key : treemap1.keySet()) {
			System.out.println(key + "----" + treemap1.get(key));
		}

		Map<Employee, String> treemap2 = new TreeMap<>();
		treemap2.put(new Employee(100, "张一", 20000), "张一都结婚了，为什么你还没结婚？");
		treemap2.put(new Employee(101, "张二", 30000), "张二都结婚了，为什么你还没结婚？");
		treemap2.put(new Employee(102, "张三", 10000), "张三都结婚了，为什么你还没结婚？");
		treemap2.put(new Employee(103, "张四", 30000), "张四都结婚了，为什么你还没结婚？");
		for (Employee employee : treemap2.keySet()) {
			System.out.println(employee + "---" + treemap2.get(employee));
		}
	}
}

class Employee implements Comparable<Employee> {

	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int compareTo(Employee o) {
		if (this.salary < o.salary) {
			return -1;
		} else if (this.salary > o.salary) {
			return 1;
		} else {
			if (this.id < o.id) {
				return -1;
			} else if (this.id > o.id) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}