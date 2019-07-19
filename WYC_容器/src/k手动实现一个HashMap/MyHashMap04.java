package k手动实现一个HashMap;

/**
 * -自定义一个HashMap <br>
 * -增加get方法 <br>
 * -考虑数组扩容方法 <br>
 * 
 * @author 王以诚
 */
public class MyHashMap04 {
	Node[] table; // 位桶数组
	int size; // 存放的键值对的个数

	public MyHashMap04() {
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

	public Object get(Object key) {
		int hash = myHash(key.hashCode(), table.length);
		Object value = null;

		if (table[hash] == null) {
			return null;
		} else {
			Node temp = table[hash];
			while (temp != null) {
				if (temp.key.equals(key)) { // 如果key相等，则返回找到的value
					return temp.value;
				} else {
					temp = temp.next;
				}
			}
			return null;
		}

	}

	public static int myHash(int v, int length) {
		// System.out.println("Hash in myHash(位运算)：" + (v & (length - 1)));
		// System.out.println("Hash in myHash(模运算)：" + ((v + 1) % (length) - 1));
		return v & (length - 1);
	}

	@Override
	public String toString() {
		// [10:aa, 20:bb, 30:cc, ....]
		StringBuilder sb = new StringBuilder("{ ");
		for (int i = 0; i < table.length; i++) {
			Node temp = table[i];
			while (temp != null) {
				sb.append("[" + temp.key + ":" + temp.value + "], ");
				temp = temp.next;
			}
		}
		sb.replace(sb.length() - 2, sb.length(), " }");
		return sb.toString();
	}

	public static void main(String[] args) {
		testCode();
	}

	public static void testCode() {
		MyHashMap04 m = new MyHashMap04();
		m.put(1, "aa");
		m.put(2, "bb");
		m.put(3, "cc");
		m.put(1, "aaRepeat");
		m.put(53, "hash5-key53");
		m.put(69, "hash5-key69");
		m.put(85, "hash5-key85");
		m.put(53, "hash5-key53 repeat");
		System.out.println(m);

//		for (int i = 0; i < 100; i++) {
//			System.out.println("myHash(" + i + "): " + myHash(i, 16));
//		}

		// 测试get方法
		System.out.println(m.get(53));
	}
}
