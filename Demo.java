package demo;

import java.util.Iterator;

public class Demo {
	
	
	
	public static void main(String[] args) {
		String[] array = {"001", "002", "003"};
		Sequence seq = new Sequence(array);
		seq.append("004");
		seq.insert(0, "005");
		Iterator<String> iterator = seq.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
