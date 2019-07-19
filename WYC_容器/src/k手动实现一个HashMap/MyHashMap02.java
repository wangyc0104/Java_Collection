package k手动实现一个HashMap;

/**
 * -自定义一个HashMap <br>
 * -定义重复元素的put方法
 * 
 * @author 王以诚
 */
public class MyHashMap02 {
	Node[] table; // 位桶数组
	int size; // 存放的键值对的个数

	public MyHashMap02() {
		table = new Node[16]; // 长度一般定义为2的整数幂
	}

	public void put(Object key, Object value) {
		Node newNode = new Node();
		newNode.hash = myHash(key.hashCode(), table.length);
		newNode.key = key;
		newNode.value = value;
		newNode.next = null;

		Node temp = table[newNode.hash];
		Node iterLast = null; // 正在遍历的最后一个元素
		boolean keyRepeat = false;
		if (temp == null) {
			// 此处数组元素为空，直接把新节点放到指定数组索引处
			table[newNode.hash] = newNode;
			size++;
		} else {
			// 此处数组元素不为空
			while (temp != null) {
				if (temp.key.equals(key)) { // 判断key如果重复，就覆盖
					System.out.println("key值：" + key + "重复");
					temp.value = newNode.value;
					keyRepeat = true;
					break;
				} else { // 如果没有重复，就直接找下一个
					iterLast = temp;
					temp = temp.next;
				}
			}
			if (!keyRepeat) { // 如果没有发生重复的情况，则添加到链表最后
				iterLast.next = newNode;
				size++;
			}
		}
	}

	public static int myHash(int v, int length) {
		// System.out.println("Hash in myHash(位运算)：" + (v & (length - 1)));
		// System.out.println("Hash in myHash(模运算)：" + ((v + 1) % (length) - 1));
		return v & (length - 1);
	}

	public static void main(String[] args) {
		testCode();
	}

	public static void testCode() {
		MyHashMap02 m = new MyHashMap02();
		m.put(1, "aa");
		m.put(2, "bb");
		m.put(3, "cc");
		m.put(1, "aaRepeat");
		m.put(53, "hash5 key53");
		m.put(69, "hash5 key69");
		m.put(85, "hash5 key85");
		m.put(53, "hash5 key53 repeat");
		System.out.println(m);

//		for (int i = 0; i < 100; i++) {
//			System.out.println("myHash(" + i + "): " + myHash(i, 16));
//		}
	}
}
