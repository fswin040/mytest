package tw.org.iii.balans;

import java.util.ArrayList;

public class N39 {

	public static void main(String[] args) {
		ArrayList set = new ArrayList();
		while(set.size()<6){
		set.add((int)(Math.random()*49+1));
			
		}
		System.out.println(set.toString());
	}
	//HashSet , TreeSet(有順序) 不重複
	//LinkedList,ArrayList 可重複

}
