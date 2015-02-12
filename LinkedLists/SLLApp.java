public class SLLApp {
	
	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.append(1);
		myList.append("2");
		myList.append("Cameron");
		myList.remove(1);
		myList.append("Milsom");
		myList.remove(1);
		System.err.println(myList.remove(1));
		System.err.println("[START]" + myList.toString());
		myList.remove(1);
		System.err.println("\nfinal delete");
		myList.remove(1);
		myList.remove(1);
		myList.append("2");
		myList.append("2");
		myList.append("2");
		myList.append("2");
		myList.remove(900);
		System.err.println("[START]" + myList.toString());
	}

}
