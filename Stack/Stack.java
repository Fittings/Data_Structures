


public class Stack {
	private Node top;
	private int count;
	
	public Stack() {
		this.top = null;
		this.count = 0;
	}
	
	public Object peek() {
		return this.top.getData();
	}
	
	public void push(Object data) {
		Node top = new Node(data);
		top.setNext(this.top);
		this.top = top;
		this.count++;
	}
	
	public Object pop() {
		if (count < 1) return null;
		Object data = top.getData();
		this.top = this.top.getNext();
		this.count--;
		return data;
	}
	
	

}
