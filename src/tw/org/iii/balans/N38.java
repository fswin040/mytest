package tw.org.iii.balans;

import java.util.HashSet;

public class N38 {
//物件序列化
	
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add (12);
		set.add (12);
		set.add (12);
		set.add(555);
		set.add(new student(2,3,5));
		System.out.println(set);
		System.out.println(set.size());
	}

}
