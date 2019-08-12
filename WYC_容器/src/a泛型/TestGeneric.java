package a泛型;

/**
 * -测试泛型
 * @author 王以诚
 */
public class TestGeneric {
	public static void main(String[] args) {
		
	}

	public static void testCode() {
		// 加了泛型后，可以在编译前做一个类型检查
		MyCollection<String> mc = new MyCollection<>();
		mc.set("王以诚", 0);
		// mc.set(8888, 1);

		String a = (String) mc.get(0);
		// Integer b = (Integer) mc.get(1);
	}
}

class MyCollection<E> { // 声明泛型一般用T,E,V，代表后期传递的某类型，仅此而已

	Object[] objs = new Object[5];

	public void set(E obj, int index) {
		objs[index] = obj;
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {
		return (E) objs[index];
	}

}