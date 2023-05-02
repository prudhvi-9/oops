package oopsConcepts;

public class DeckOfCardsUsingQueue<T> {

	class Node<T> {

		public T data;
		public Node<T> next;

		/**
		 * Parameterized Constructor
		 * 
		 * @param data
		 */
		public Node(T data) {
			this.data = data;
		}

		/**
		 * Constructor
		 */
		public Node() {
			data = null;
		}
	}

	Node<T> front, rear;
	int size;

	/**
	 * Constructor
	 */
	public DeckOfCardsUsingQueue() {
		front = null;
		rear = null;
		size = 0;
	}

	/**
	 * method to enter a node in the queue
	 */
	public void enqueue(T data) {
		Node<T> n1 = new Node<>(data);
		if (front == null && rear == null) {
			front = n1;
			rear = n1;
			size++;
			return;
		}
		Node<T> t = rear;
		while (t.next != null) {
			t = t.next;
		}
		t.next = n1;
		rear = t;
		size++;
	}

	/**
	 * Method to display the queue
	 */
	public void display() {
		if (size == 0) {
			System.out.println("Linked List is empty");
			return;
		}
		Node<T> temp = front;
		System.out.println("The queue:");
		while (temp != null) {
			System.out.print(temp.data + " , ");
			temp = temp.next;
		}
	}

	/**
	 * Method to remove a node from the queue
	 */
	public T dequeue() {
		if (front == null) {
			return (T) "queue empty";
		}
		T data = front.data;
		front = front.next;
		if (front == null) {
			rear = null;
		}
		size--;
		return data;
	}

	/**
	 * Method to find the size of the queue
	 * 
	 * @return size of the queue
	 */
	public int size() {
		return size;
	}

	/**
	 * Method to find whether the queue is empty or not
	 * 
	 * @return boolean
	 */
	public boolean isEmpty() {
		if (front == null) {
			return true;
		}
		return false;
	}

}
