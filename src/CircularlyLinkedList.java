
public class CircularlyLinkedList<E> {
	private static class Node<E> {
		private E element; // an element stored at this node
		private Node<E> next; // a reference to the subsequent node in the list
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
		public E getElement() {
			return element;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> n) {
			next = n;
		}
	}
	private Node<E> tail = null; // we store tail (but not head)
	private int size = 0; // number of nodes in the list
	public CircularlyLinkedList() {
	} // constructs an initially empty list
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public E first() { // returns (but does not remove) the first element
		if (isEmpty())
			return null;
		return tail.getNext().getElement(); // the head is *after* the tail
	}
	public E last() { // returns (but does not remove) the last element
		if (isEmpty())
			return null;
		return tail.getElement();
	}
	public void rotate() { // rotate the first element to the back of the list
		if (tail != null) // if empty, do nothing
			tail = tail.getNext(); // the old head becomes the new tail
	}
	public void addFirst(E e) { // adds element e to the front of the list
		if (size == 0) {
			tail = new Node<>(e, null);
			tail.setNext(tail); // link to itself circularly
		} else {
			Node<E> newest = new Node<>(e, tail.getNext());
			tail.setNext(newest);
		}
		size++;
	}
	public void addLast(E e) {
		addFirst(e);
		tail = tail.getNext();
	}
	public E removeFirst() {
		if (isEmpty())
			return null;
		Node<E> head = tail.getNext();
		if (head == tail)
			tail = null;
		else
			tail.setNext(head.getNext());
		size--;
		return head.getElement();
	}
	public String toString() {
		if (tail == null)
			return "()";
		StringBuilder sb = new StringBuilder("(");
		Node<E> walk = tail;
		do {
			walk = walk.getNext();
			sb.append(walk.getElement());
			if (walk != tail)
				sb.append(", ");
		} while (walk != tail);
		sb.append(")");
		return sb.toString();
	}
}
