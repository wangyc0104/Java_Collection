package t使用容器存储表格;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestStoreBean {
	public static void main(String[] args) {
		testCode();
	}

	public static void testCode() {
		User user1 = new User(1001, "张三", 20000, "2018.05.05");
		User user2 = new User(1002, "李四", 30000, "2005.04.04");
		User user3 = new User(1003, "王五", 3000, "2020.05.04");

		List<User> list = new ArrayList<>();
		list.add(user1);
		list.add(user2);
		list.add(user3);

		for (User u : list) {
			System.out.println(u);
		}

		Map<Integer, User> map = new HashMap<>();
		map.put(1001, user1);
		map.put(1002, user2);
		map.put(1003, user3);

		for (User u : list) {
			System.out.println(u);
		}

	}
}

// 一个完整的JavaBean，要有一个set和get方法，以及无参构造器
class User {
	private int id;
	private String name;
	private double salary;
	private String hiredate;

	public User() {
	}

	public User(int id, String name, double salary, String hiredate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.hiredate = hiredate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		return "id:" + id + ",name:" + name + ",salary:" + salary + ",hireday:" + hiredate;
	}
}