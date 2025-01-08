import java.util.NoSuchElementException;

public class OrderedList implements OrderedStructure {

	
	private static class Node {
		
		private Comparable value;
		private Node previous;
		private Node next;
		
		private Node (Comparable value, Node previous, Node next) {
			this.value = value;
			this.previous = previous;
			this.next = next;
		}

	}
	

	
	private Node head;
	private int size;
	
	
	
	public OrderedList() {
		head = new Node(null, null, null);
		head.previous = head;
		head.next = head;
	}
	
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public Object get(int pos) {
		if (pos >= size || pos < 0) {
			throw new IndexOutOfBoundsException();
		}
		Node target = head.next;
		for (int i = 0; i < pos; i++) {
			target = target.next;
		}
		return target.value;
	}
	
	
	@Override
	public boolean add(Comparable o) {
		if (o == null) {
			throw new IllegalArgumentException();
		}
		Node next = head.next;
		while (next.value != null && o.compareTo(next.value) > 0) {
			next = next.next;
		}
		Node previous = new Node(o, next.previous, next);
		next.previous.next = previous;
		next.previous = previous;
		size++;
		return true;
	}
	
	
	@Override
	public void remove(int pos) {
		if (pos >= size || pos < 0) {
			throw new IndexOutOfBoundsException();
		}
		Node target = head.next;
		for (int i = 0; i < pos; i++) {
			target = target.next;
		}
		// System.out.print("remove target: ");
		// target.debug();
		target.previous.next = target.next;
		target.next.previous = target.previous;
		target = null;
		size--;
	}
	

	
	public void merge(OrderedList other) {
		for (int i = 0; i < other.size(); i++) {
			add((Comparable)other.get(i));
			
		}
	}

}
