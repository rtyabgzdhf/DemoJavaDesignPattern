package demo.adapter.turkey;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumAdapter implements Enumeration<String> {
	
	Iterator<String> list;
	public IteratorEnumAdapter(Iterator<String> list) {
		// TODO Auto-generated constructor stub
		this.list = list;
	}

	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return this.list.hasNext();
	}

	@Override
	public String nextElement() {
		// TODO Auto-generated method stub
		return this.list.next();
	}

}
