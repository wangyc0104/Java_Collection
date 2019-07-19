package i测试HashMap的常用方法;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		testCode();
	}

	public static void testCode() {
		Employee e1 = new Employee(1001, "王以诚", 50000);
		Employee e2 = new Employee(1002, "孙堂瀚", 40000);
		Employee e3 = new Employee(1003, "谢尚龙", 30000);
		Employee e4 = new Employee(1004, "周德明", 20000);

		Map<Integer, Employee> map = new HashMap<>();

		map.put(1001, e1);
		map.put(1002, e2);
		map.put(1003, e3);
		map.put(1001, e4);

		Employee emp = map.get(1001);
		System.out.println(emp);
		System.out.println(map);
	}

}

class Employee {

	private int id;
	private String ename;
	private double salary;

	public Employee(int id, String ename, double salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[" + id + ":" + ename + "]";
	}

}