public class Node {
		private Node next = null;
		private Object data;
		
		public Node(Object data) {
			next = null;
			this.data = data;
		}
		
		public Node() {
			next = null;
			this.data = null;
		}
		
		public Node getNext() {
			return this.next;
		}
		
		public Object getData() {
			return this.data;
		}
		
		public boolean hasNext() {
			return !(this.next == null);
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
		
		public void setData(Object data) {
			this.data = data;
		}
	}