package e写一个自己的ArrayList;

/**
 * 自定义实现一个Arraylist <br>
 * 增加remove功能 <br>
 * 
 * @author 王以诚
 */
public class MyArrayList05<E> {

	private Object[] elementData;
	private int size;

	private static final int DEFAULT_CAPACITY = 10;

	public MyArrayList05() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList05(int capacity) {
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

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void add(E element) {
		// 什么时候扩容？
		if (size >= elementData.length) {
			// 怎么扩容？
			System.out.println("现在size = " + size + ", 数组length = " + elementData.length + "扩容");
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

	public void remove(int index) {
		checkRange(index);
		System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
		elementData[size-- - 1] = null;
	}

	public void remove(E element) {
		// 先进行比较
		for (int i = 0; i < size; i++) {
			if (element.equals(get(i))) { // 容器中做的所有比较操作都是用equals而不是==
				remove(i);
			}
		}
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
		MyArrayList05<String> s1 = new MyArrayList05<>();
		for (int i = 0; i < 20; i++) {
			s1.add("" + i);
			System.out.println(s1);
		}
		System.out.println(s1.toString());

		// 修改
		s1.set("待删元素", 9);
		System.out.println(s1.toString());
		// 删除
		s1.remove(9);
		System.out.println(s1.toString());
		s1.remove("8");
		System.out.println(s1.toString());
		// 测试size, isEmpty
		System.out.println("测试size " + s1.size);
		System.out.println("测试isEmpty " + s1.isEmpty());

	}
}
