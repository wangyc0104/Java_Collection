package zz一些乱七八糟的代码;

import java.util.HashSet;
import java.util.TreeSet;

public class Practice2 {
	public static void main(String[] args) {
		HashSet<Book2> hashSet = new HashSet<>();
		hashSet.add(new Book2(1, "书01", 50, "机械工业出版社"));
		hashSet.add(new Book2(2, "书02", 30, "人民出版社"));
		hashSet.add(new Book2(3, "书03", 40, "中华书社"));
		hashSet.add(new Book2(4, "书04", 20, "新时代出版社"));
		for (Book2 book : hashSet) {
			System.out.println(book);
		}

		TreeSet<Book2> treeSet = new TreeSet<>();
		treeSet.add(new Book2(1, "书01", 50, "机械工业出版社"));
		treeSet.add(new Book2(2, "书02", 30, "人民出版社"));
		treeSet.add(new Book2(3, "书03", 40, "中华书社"));
		treeSet.add(new Book2(4, "书04", 20, "新时代出版社"));
		for (Book2 book : treeSet) {
			System.out.println(book);
		}

	}
}

class Book2 implements Comparable {
	private int id;
	private String name;
	private double price;
	private String publisher;

	public Book2(int id, String name, double price, String publisher) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.publisher = publisher;
	}

	public Book2() {
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

	public int hashCode() {
		return id % 2 == 0 ? 1 : 0;
	}

	public boolean equals(Object obj) {
		return hashCode() == ((Book2) obj).hashCode();
	}

	public int compareTo(Object o) {
		if (price > ((Book2) o).price)
			return 1;
		else if (price < ((Book2) o).price)
			return -1;
		else
			return 0;
	}
}