package k手动实现一个HashMap;

public class NodeT<K, V> {
	int hash;
	K key;
	V value;
	NodeT<K, V> next;

	public int getHash() {
		return hash;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public NodeT<K, V> getNext() {
		return next;
	}

	public NodeT() {
	}

	public NodeT(int hash, K key, V value, NodeT<K, V> next) {
		super();
		this.hash = hash;
		this.key = key;
		this.value = value;
		this.next = next;
	}

}
