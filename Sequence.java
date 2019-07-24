package demo;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Sequence implements Iterable<String> {
	private String[] data;

	public Sequence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sequence(String[] data) {
		super();
		this.data = data;
	}
	
	public String[] append(String append) {
		String[] result = new String[data.length + 1];
		for (int i = 0; i <data.length;i++) {
			result[i] = data[i];
		}
		result[data.length] = append;
		this.data = result;
		return result;
	}
	
	public String[] insert(int index, String insert) {
		String[] result = new String[data.length + 1];
		int j = 0;
		for(int i = 0; i< data.length;i++) {
			if(i == index) {
				j++;
			}
			result[j++] = data[i];
		}
		result[index] = insert;
		this.data = result;
		return result;
	}

	int index = 0;
	@Override
	public Iterator<String> iterator() {
		int endIndex = data.length;
		Iterator iterator = new Iterator<String>() {

			@Override
			public boolean hasNext() {
				return (index < endIndex);
			}

			@Override
			public String next() {
				if (hasNext() == false) {
		            throw new NoSuchElementException();
		        }
		        return data[index++];
			}
		};
		return iterator;
	}

}
