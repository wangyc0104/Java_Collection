package f写一个自己的LinkedList;

/**
 * -自定义一个链表 <br>
 * 增加小的封装，增加泛型
 * 
 * @author 王以诚
 */
public class MyLinkedList04<E> {

	private Node first;
	private Node last;

	private int size;

	// 添加一个新节点
	public void add(E element) { // 选中参数后按alt_shift_R重构
		Node node = new Node(element);
		if (first == null) { // [] --> ["a"]
			// node.previous = null;
			// node.next = null;
			first = node;
			last = node;
			size++;
		} else { // ["a", "b"] --> ["a", "b", "c"]
			node.previous = last;
			last.next = node;
			last = node;
			size++;
		}
	}

	// 在中间插入一个节点
	public void add(int index, E element) {
		if (index == size) {
			add(element);
		} else {
			checkRange(index);
			Node temp = getNode(index);
			Node newNode = new Node(element);
			if (temp != null) {
				if (index != 0) {
					Node up = temp.previous;
					up.next = newNode;
					newNode.previous = up;
				} else {
					first = newNode;
				}
				newNode.next = temp;
				temp.previous = newNode;
				size++;
			}
		}
	}

	// 查询某个节点["a", "b", "c", "d"]
	@SuppressWarnings("unchecked")
	public E get(int index) {
		checkRange(index);
		if (index < 0 || index > size - 1) {
			throw new RuntimeException("索引数字不合法：" + index);
		}
		Node temp = getNode(index);
		return temp == null ? null : (E) temp.element;
	}

	// 检测节点index是否合法
	private void checkRange(int index) {
		if (index < 0 || index > size - 1) {
			throw new RuntimeException("节点不合法");
		}
	}

	// 根据某index得到某节点
	private Node getNode(int index) {
		Node temp;
		if (index < (size >> 1)) {
			// 从前往后找
			System.out.println("从前往后找");
			temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		} else {
			// 从后往前找
			System.out.println("从后往前找");
			temp = last;
			for (int i = size - 1; i > index; i--) {
				temp = temp.previous;
			}
		}
		return temp;
	}

	// 删除某个节点
	public void remove(int index) {
		checkRange(index);
		Node temp = getNode(index);
		if (temp != null) {
			Node up = temp.previous;
			Node down = temp.next;
			// 被删除的元素是第1个
			if (index == 0) {
				first = down;
			}
			// 被删除的元素是最后1个
			if (index == size - 1) {
				last = up;
			}
			if (up != null)
				up.next = down;
			if (down != null)
				down.previous = up;
			size--;
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append("[");
		Node temp = first;
		while (temp != null) {
			// 逗号的放置（注释的方法比较傻）
			// sb.append(temp.element);
			// if (temp != last) {
			// sb.append(", ");
			// }
			sb.append(temp.element + ", ");
			temp = temp.next;
		}
		// sb.append("]");
		sb.replace(sb.length() - 2, sb.length(), "]");
		return sb.toString();
	}

	public static void main(String[] args) {
		testCode();
	}

	public static void testCode() {
		// List基本测试
		MyLinkedList04<String> list = new MyLinkedList04<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		System.out.println(list);
		System.out.println("list.get(2): " + list.get(2));
		System.out.println("list.size: " + list.size + "\n");

		// List的remove测试
		System.out.println("list.remove(3)");
		list.remove(3);
		System.out.println(list);
		System.out.println("list.size: " + list.size + "\n");

		System.out.println("list.remove(0)");
		list.remove(0);
		System.out.println(list);
		System.out.println("list.size: " + list.size + "\n");

		System.out.println("list.remove(list.size - 1)");
		list.remove(list.size - 1);
		System.out.println(list);
		System.out.println("list.size: " + list.size + "\n");

		// List的Insert操作
		System.out.println("list.add(0, \"firstInsert\");");
		list.add(0, "firstInsert");
		System.out.println(list);
		System.out.println("list.size: " + list.size + "\n");

		System.out.println("list.add(list.size - 1, \"beforeLastInsert\");");
		list.add(list.size - 1, "beforeLastInsert");
		System.out.println(list);
		System.out.println("list.size: " + list.size + "\n");

		System.out.println("list.add(list.size, \"lastInsert\");");
		list.add(list.size, "lastInsert");
		System.out.println(list);
		System.out.println("list.size: " + list.size + "\n");

		// List添加非泛型类型元素会报错
		// list.add(1);
	}

}
