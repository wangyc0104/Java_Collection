package zz一些乱七八糟的代码;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice1 {
	public static void main(String[] args) {
		List<Book1> list = new ArrayList<>();
		list.add(new Book1(1, "书01", 50, "机械工业出版社"));
		list.add(new Book1(2, "书02", 30, "人民出版社"));
		list.add(new Book1(3, "书03", 40, "中华书社"));
		list.add(new Book1(4, "书04", 20, "新时代出版社"));
		for (Book1 book : list) {
			System.out.println(book);
		}
		System.out.println();

		Map<Integer, Book1> map = new HashMap<>();
		map.put(1, new Book1(1, "书01", 50, "机械工业出版社"));
		map.put(2, new Book1(2, "书02", 30, "人民出版社"));
		map.put(3, new Book1(3, "书03", 40, "中华书社"));
		map.put(4, new Book1(4, "书04", 20, "新时代出版社"));
		for (Book1 book : map.values()) {
			System.out.println(book);
		}
		System.out.println();

	}
}

class Book1 {
	private int id;
	private String name;
	private double price;
	private String publisher;

	public Book1(int id, String name, double price, String publisher) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.publisher = publisher;
	}

	public Book1() {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", publisher=" + publisher + "]";
	}

}