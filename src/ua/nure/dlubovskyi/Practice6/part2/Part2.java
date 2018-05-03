package ua.nure.dlubovskyi.Practice6.part2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Part2 {
	static final int COUNT = 3;

	public static void main(String[] args) {
		ArrayList<Human> list = new ArrayList<>();
		LinkedList<Human> linkedList = new LinkedList<>();
		fillList(list);
		fillList(linkedList);
		long startTime = System.currentTimeMillis();
		useIterator(list);
		long endTime = System.currentTimeMillis();
		System.out.println("Time spent using iterator for ArrayList: " + (endTime - startTime));
		startTime = System.currentTimeMillis();
		useIterator(linkedList);
		endTime = System.currentTimeMillis();
		System.out.println("Time spent using iterator for LinkedList: " + (endTime - startTime));

	}

	static void useIterator(List<Human> humans) {
		int humanCounter = 0;
		ListIterator<Human> listIterator;
		while (humans.size() != 1) {
			listIterator = humans.listIterator();
			while (listIterator.hasNext()) {
				listIterator.next();
				humanCounter++;

				if (humanCounter == COUNT) {
					listIterator.remove();
					humanCounter = 0;
				}
			}
		}
	}
	
	static void fillList(List<Human> humans) {
		for (int i = 0; i < 100000; i++) {
			humans.add(new Human("" + i));
		}
	}

}
