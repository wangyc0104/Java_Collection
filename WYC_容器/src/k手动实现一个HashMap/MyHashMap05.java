package k手动实现一个HashMap;

/**
 * -自定义一个HashMap <br>
 * -增加泛型 <br>
 * 
 * @author 王以诚
 */
public class MyHashMap05<K, V> {
	NodeT<K, V>[] table; // 位桶数组
	int size; // 存放的键值对的个数

	@SuppressWarnings("unchecked")
	public MyHashMap05() {
		table = new NodeT[16]; // 长度一般定义为2的整数幂
	}

	public void put(K key, V value) {
		NodeT<K, V> newNodeT = new NodeT<K, V>();
		newNodeT.hash = myHash(key.hashCode(), table.length);
		newNodeT.key = key;
		newNodeT.value = value;
		newNodeT.next = null;

		NodeT<K, V> temp = table[newNodeT.hash];
		NodeT<K, V> iterLast = null; // 正在遍历的最后一个元素
		boolean keyRepeat = false;
		if (temp == null) {
			// 此处数组元素为空，直接把新节点放到指定数组索引处
			table[newNodeT.hash] = newNodeT;
		} else {
			// 此处数组元素不为空
			while (temp != null) {
				if (temp.key.equals(key)) { // 判断key如果重复，就覆盖
					System.out.println("key值：" + key + "重复");
					temp.value = newNodeT.value;
					keyRepeat = true;
					break;
				} else { // 如果没有重复，就直接找下一个
					iterLast = temp;
					temp = temp.next;
				}
			}
			if (!keyRepeat) { // 如果没有发生重复的情况，则添加到链表最后
				iterLast.next = newNodeT;
			}
		}
	}

	public V get(K key) {
		int hash = myHash(key.hashCode(), table.length);

		if (table[hash] == null) {
			return null;
		} else {
			NodeT<K, V> temp = table[hash];
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
			NodeT<K, V> temp = table[i];
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
		MyHashMap05<Integer, String> m = new MyHashMap05<Integer, String>();
		m.put(1, "aa");
		m.put(2, "bb");
		m.put(3, "cc");
		m.put(1, "aaRepeat");
		m.put(53, "hash5-key53");
		m.put(69, "hash5-key69");
		m.put(85, "hash5-key85");
		m.put(53, "hash5-key53 repeat");
		// m.put("30", "hash5-key53 repeat"); // 和<Integer, String>不匹配
		System.out.println(m);

//		for (int i = 0; i < 100; i++) {
//			System.out.println("myHash(" + i + "): " + myHash(i, 16));
//		}

		// 测试get方法
		System.out.println(m.get(53));
	}
}
