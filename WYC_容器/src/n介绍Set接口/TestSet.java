package n介绍Set接口;

/**
 * Set没有顺序，不可重复
 * List有顺序，可重复
 * 
 * @author 王以诚
 */
import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("aa");
		set1.add("bb");
		set1.add("cc");
		set1.add("dd");
		System.out.println(set1);
		Set<String> set2 = new HashSet<>();
		set2.add("王以诚");
		set2.add("码农");
		set2.addAll(set1);
		System.out.println(set2);
	}

	public static void testCode() {

	}

	public static void practiceCode() {

	}
}
