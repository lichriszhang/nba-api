package demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		LinkedList<Integer> linkList = new LinkedList<Integer>();

		long time1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			linkList.add(0, i);
		}

		long time2 = System.currentTimeMillis();
		System.out.println("链表插入1000个元素所用时间：" + (time2 - time1));
		List<Integer> list = new ArrayList<>();
		
		long time3 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.add(0, i);
		}
		long time4 = System.currentTimeMillis();
		System.out.println("顺序表插入1000个元素所用时间：" + (time4 - time3));
	}

}
