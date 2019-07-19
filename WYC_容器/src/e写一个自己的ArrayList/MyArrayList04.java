package e写一个自己的ArrayList;

/**
 * 自定义实现一个Arraylist <br>
 * 增加数组set和get功能 <br>
 * 增加数组边界检查
 * 
 * @author 王以诚
 */
public class MyArrayList04<E> {

	private Object[] elementData;
	private int size;

	private static final int DEFAULT_CAPACITY = 10;

	public MyArrayList04() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList04(int capacity) {
		if (capacity < 0) {
			throw new RuntimeException("容器的容量不能为负数!");
		} else if (capacity == 0) {
			elementData = new Object[DEFAULT_CAPACITY];
		} else {
			elementData = new Object[capacity];
		}
	}

	public void checkRange(int index) {
		// 判断索引合法：[0, size)外的数字都不合法
		if (index < 0 || index > size - 1) {
			// 不合法，抛出异常
			throw new RuntimeException("索引不合法！");
		}
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

	@SuppressWarnings("unchecked")
	public E get(int index) {
		// 判断索引合法：[0, size)
		checkRange(index);
		return (E) elementData[index];
	}

	public void set(E element, int index) {
		// 判断索引合法：[0, size)
		checkRange(index);
		elementData[index] = element;
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
		// MyArrayList04<String> s1 = new MyArrayList04<>(-1); // 会报错
		MyArrayList04<String> s1 = new MyArrayList04<>(0);
		for (int i = 0; i < 40; i++) {
			s1.add("" + i);
		}
		System.out.println(s1.toString());
		s1.set("GOOD", 10);
		System.out.println(s1.toString());
		System.out.println(s1.get(39));
	}
}
