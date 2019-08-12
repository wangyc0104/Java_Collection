package m介绍Hashtable和HashMap;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class TestHashtable {
	// HashMap线程不安全，效率高，允许key和value为null
	// Hashtable线程不安全，效率纸，不允许key和value为null
	Hashtable ht = new Hashtable(); // Hashtable的t是小写！！！！
	ConcurrentHashMap<String, Object> chm = new ConcurrentHashMap<>();
}
