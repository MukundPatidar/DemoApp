package DSA;

public class Main {
	public static void main(String[] args) {
		Stack myStack = new Stack(5);
		myStack.isEmpty();
		myStack.isFull();
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.display();
		myStack.pop(); 
		myStack.isEmpty();
		myStack.isFull();
		myStack.count();
		myStack.change(0, 50);
		myStack.peek(1);
		myStack.display();
	}
}