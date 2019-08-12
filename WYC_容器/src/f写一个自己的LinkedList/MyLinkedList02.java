package f写一个自己的LinkedList;

/**
 * -自定义一个链表
 * @author 王以诚
 */
public class MyLinkedList02 {

	private Node first;
	private Node last;

	private int size;

	// 添加一个新节点
	public void add(Object obj) {
		Node node = new Node(obj);
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

	// ["a", "b", "c", "d"]
	public Object get(int index) {
		if (index < 0 || index > size - 1) {
			throw new RuntimeException("索引数字不合法：" + index);
		}
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
		return temp.element;
	}

	// 练习写get方法
	public Object getPractice(int index) {
		if (index < 0 || index > size - 1) {
			throw new RuntimeException("索引不合法！");
		} else {
			Node temp;
			if (index > (size >> 1)) { // 从后往前找
				temp = last;
				for (int i = size - 1; i > index; i--) {
					temp = temp.previous;
				}
			} else {
				temp = first;
				for (int i = 0; i < index; i++) {
					temp = temp.next;
				}
			}
			return temp;
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
		MyLinkedList02 list = new MyLinkedList02();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		System.out.println(list);
		System.out.println(list.size);
		System.out.println(list.get(2));
	}
}
