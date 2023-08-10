
public class Main {

	public static void main(String[] args) {
		SinglyLinkedList1 l1= new SinglyLinkedList1<>();
		l1.addFirst(1);
		l1.addLast(2);
		l1.addLast(3);
		l1.addLast(4);
		l1.addLast(5);
		System.out.println(l1.toString());
        l1.swapNodes(2,4);
        System.out.println(l1.toString());
	
	}
	
	}


