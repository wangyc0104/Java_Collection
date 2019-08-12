package e写一个自己的ArrayList;

/**
 * 自定义实现一个Arraylist
 * 添加泛型
 * @author 王以诚
 */
public class MyArrayList02<E> {

	private Object[] elementData;
	private int size;

	private static final int DEFAULT_CAPACITY = 10;

	public MyArrayList02() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList02(int capacity) {
		elementData = new Object[capacity];
	}

	public void add(E element) {
		elementData[size++] = element;
	}

	public String toString() {
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
		MyArrayList02<String> s1 = new MyArrayList02<>(20);
		s1.add("aa");
		s1.add("bb");
		System.out.println(s1.toString());
	}
	
}
