package f写一个自己的LinkedList;

/**
 * -自定义一个链表
 * 
 * @author 王以诚
 */
public class MyLinkedList01 {

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
		} else { // ["a", "b"] --> ["a", "b", "c"]
			node.previous = last;
			last.next = node;
			last = node;
			size++;
		}
	}

	// 练习增加节点
	public void addPractice(Object obj) {
		Node node = new Node(obj);
		if (first == null) {
			first = node;
			last = node;
		} else {
			node.previous = last;
			node.next = null;
			node.element = obj;
			last = node;
			size++;
		}
	}
	
	// 覆盖toString方法
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
		MyLinkedList01 list = new MyLinkedList01();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list);
	}
}
