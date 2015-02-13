
public class StackApp {

	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push("My");
		myStack.push("Name");
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		myStack.push("is");
		myStack.push("Cameron");
		myStack.push("Darren");
		myStack.push("Milsom");
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
		System.err.println(myStack.pop());
	}

}
