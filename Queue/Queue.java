

public class Queue {
	private int count;
	private Node head;

	
	public Queue() {
		this.head = new Node();
		this.count = 0;
	}
	
	public Boolean enqueue(Object data) {
		Node newNode = new Node(data);
		newNode.setNext(this.head.getNext());
		this.head.setNext(newNode);
		this.count++;
		return true;
	}
	
	public Object dequeue() {
		if (!this.head.hasNext()) return "Empty Queue";
		Node tempNode = this.head;
		while(tempNode.getNext().hasNext()) {
			tempNode = tempNode.getNext();
		}
		Object data = tempNode.getNext().getData();
		tempNode.setNext(null);
		this.count--;
		return data;
	}
	
	public int getSize() {
		return this.count;
	}
	
}
