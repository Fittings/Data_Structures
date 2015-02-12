
public class StackApp {

	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push("Hello");
		myStack.push("World");
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		myStack.push("Hello");
		myStack.push("World");
		myStack.push("Hello");
		myStack.push("World");
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
	}

}
