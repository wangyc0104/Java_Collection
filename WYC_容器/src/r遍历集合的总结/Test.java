package r遍历集合的总结;

public class Test {
	public static void main(String[] args) { }

	public static void testCode() {
//		【示例1】遍历List方法一：普通for循环
//		for(int i=0;i<list.size();i++){//list为集合的对象名
//		    String temp = (String)list.get(i);
//		    System.out.println(temp);
//		}
//
//		【示例2】遍历List方法二：增强for循环(使用泛型!)
//		for (String temp : list) {
//		System.out.println(temp);
//		}
//
//		【示例3】遍历List方法三：使用Iterator迭代器(1)
//		for(Iterator iter= list.iterator();iter.hasNext();){
//		    String temp = (String)iter.next();
//		    System.out.println(temp);
//		}
//
//		【示例4】遍历List方法四：使用Iterator迭代器(2)
//		Iterator  iter =list.iterator();
//		while(iter.hasNext()){
//		    Object  obj =  iter.next();
//		    iter.remove();//如果要遍历时，删除集合中的元素，建议使用这种方式！
//		    System.out.println(obj);
//		}
//
//		【示例5】遍历Set方法一：增强for循环
//		for(String temp:set){
//		System.out.println(temp);
//		}
//
//		【示例6】遍历Set方法二：使用Iterator迭代器
//		for(Iterator iter = set.iterator();iter.hasNext();){
//		    String temp = (String)iter.next();
//		    System.out.println(temp);
//		}
//
//		【示例7】遍历Map方法一：根据key获取value
//		Map<Integer, Man> maps = new HashMap<Integer, Man>();
//		Set<Integer>  keySet =  maps.keySet();
//		for(Integer id : keySet){
//		System.out.println(maps.get(id).name);
//		}
//
//		【示例8】遍历Map方法二：使用entrySet
//		Set<Entry<Integer, Man>> ss = maps.entrySet();
//		for (Iterator iterator = ss.iterator(); iterator.hasNext();) {
//		    Entry e = (Entry) iterator.next(); 
//		    System.out.println(e.getKey()+"--"+e.getValue());
//		}
	}
}
