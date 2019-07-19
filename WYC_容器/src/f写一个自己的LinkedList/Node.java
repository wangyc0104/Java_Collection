package f写一个自己的LinkedList;

public class Node {

	Node previous; // 上一个节点
	Node next; // 下一个节点
	Object element; // 元素数据
	
	public Node(Object element) {
		super();
		this.element = element;
	}

	public Node(Node previous, Node next, Object element) {
		super();
		this.previous = previous;
		this.next = next;
		this.element = element;
	}

}
