package e写一个自己的ArrayList;

/**
 * 自定义实现一个Arraylist <br>
 * 增加数组扩容功能
 * 
 * @author 王以诚
 */
public class MyArrayList03<E> {

	private Object[] elementData;
	private int size;

	private static final int DEFAULT_CAPACITY = 10;

	public MyArrayList03() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList03(int capacity) {
		elementData = new Object[capacity];
	}

	public void add(E element) {
		// 什么时候扩容？
		if (size >= elementData.length) {
			// 怎么扩容？
			System.out.println("扩容");
			Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;
		}
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
		MyArrayList03<String> s1 = new MyArrayList03<>();
		for (int i = 0; i < 40; i++) {
			s1.add("" + i);
		}
		System.out.println(s1.toString());
	}
}
