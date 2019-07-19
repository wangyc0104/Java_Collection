package p介绍TreeSet;

import java.util.Set;
import java.util.TreeSet;

/**
 * -测试TreeSet的使用 <br>
 * -熟悉Comparable接口（可以参考TreeMap）<br>
 * 
 * @author 王以诚
 */
public class TestTreeSet {
	public static void main(String[] args) {
		testCode();
	}

	public static void testCode() {
		Set<Integer> set = new TreeSet<>();

		set.add(500);
		set.add(400);
		set.add(300);
		set.add(200);
		set.add(100);

		// 按照元素递增的方法进行排序
		for (Integer i : set) {
			System.out.println(i);
		}

		Set<Employee> set2 = new TreeSet<>();
		set2.add(new Employee(100, "张一", 20000));
		set2.add(new Employee(101, "张二", 30000));
		set2.add(new Employee(102, "张三", 10000));
		set2.add(new Employee(103, "张四", 30000));

		for (Employee e : set2) {
			System.out.println(e);
		}

	}

	public static void practiceCode() {

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