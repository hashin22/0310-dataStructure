package week5;


public class ListNode <E>{
	private E item; 
	private ListNode<E> next;
	public ListNode(E item, ListNode<E> next) {
		super();
		this.item = item;
		this.next = next;
	}

	public E getItem() {
		return item;
	}

	public void setItem(E item) {
		this.item = item;
	}

	public ListNode<E> getNext() {
		return next;
	}

	public void setNext(ListNode<E> next) {
		this.next = next;
	}




}
