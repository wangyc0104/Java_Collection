package e写一个自己的ArrayList;

/**
 * 自定义实现一个Arraylist
 * 
 * @author 王以诚
 */
public class MyArrayList01 {

	private Object[] elementData;
	private int size;

	private static final int DEFAULT_CAPACITY = 10;

	public MyArrayList01() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList01(int capacity) {
		elementData = new Object[capacity];
	}

	public void add(Object obj) {
		elementData[size++] = obj;
	}

	public String toString() {
		// StringBuffer：线程安全的字符串构建器，性能低
		// StringBuilder：线程不安全的字符串构建器，性能高
		StringBuilder sb = new StringBuilder();
		// 按照[a, b, c]的格式输出
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(elementData[i]);
			if (i < size - 1)
				sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}

	public static void main(String[] args) {
		MyArrayList01 s1 = new MyArrayList01(20);
		s1.add("aa");
		s1.add("bb");
		System.out.println(s1.toString());
	}
	
}
