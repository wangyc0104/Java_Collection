package k手动实现一个HashMap;

/**
 * -自定义一个HashMap <br>
 * -定义put方法
 * @author 王以诚
 */
public class MyHashMap01 {
	Node[] table; // 位桶数组
	int size; // 存放的键值对的个数

	public MyHashMap01() {
		table = new Node[16]; // 长度一般定义为2的整数幂
	}

	public void put(Object key, Object value) {
		Node newNode = new Node();
		newNode.hash = myHash(key.hashCode(), table.length);
		newNode.key = key;
		newNode.value = value;
		newNode.next = null;

		Node temp = table[newNode.hash];
		if (temp == null) {
			// 此处数组元素为空，直接把新节点放到指定数组索引处
			table[newNode.hash] = newNode;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public int myHash(int v, int length) {
		// System.out.println("Hash in myHash(位运算)：" + (v & (length - 1)));
		// System.out.println("Hash in myHash(模运算)：" + ((v + 1) % (length) -
		// 1));
		return v & (length - 1);
	}

	public static void main(String[] args) {
		MyHashMap01 m = new MyHashMap01();
		m.put(16, "aa");
		m.put(32, "bb");
		m.put(48, "cc");
		System.out.println(m);
	}
}
