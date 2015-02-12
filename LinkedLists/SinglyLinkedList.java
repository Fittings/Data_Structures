/* Cameron Milsom - Singly Linked List Java - 2015 */
public class SinglyLinkedList {
	private Node head;
	private int count = 0;
	
	public SinglyLinkedList() {
		this.head = new Node(null);
		this.count++;
	}
	
	public void append(Object data) {
		Node tempNode = this.head;
		while (tempNode.hasNext()) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(new Node(data));
		this.count++;
	}
	
	public void appendTo(Object data, int index) {
		Node tempNode = this.head;
		int i = 0;
		while (tempNode.hasNext() && (i <= index)) {
			i++;
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(new Node(data));
		this.count++;
	}
	
	@Override
	public String toString() {
		Node tempNode = this.head;
		String output = "";
		while (tempNode.hasNext()) {
			tempNode = tempNode.getNext();
			output += "[" + tempNode.getData().toString() + "]";
		}
		return output;
	}
	
	public Object get(int index) {
		Node tempNode = this.head;
		for (int i = 0; i < index; i++) {
			if (!tempNode.hasNext()) return null;
			tempNode = tempNode.getNext();
		}
		return tempNode.getData();
	}
	
	public boolean remove(int index) {
		if (index < 1) return false;
		if (this.count <= 1) return false;
		Node tempNode = this.head;
		for (int i = 0; i < index-1; i++) {
			if (!tempNode.hasNext()) return false;
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(tempNode.getNext().getNext());
		this.count--;
		return true;
	}
	


}

