public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        System.out.println("Initial size: " + ll.getSize());
        ll.insertFirst(30);
        ll.insertFirst(9);
        ll.insertLast(2002);
        ll.insert(5, 2);
        ll.insert(1, 2);
        ll.display();
        ll.removeFirst();
        ll.display();
        ll.removeLast();
        ll.display();
        ll.remove(1);
        ll.display();
        var ele = ll.find(5);
        System.out.println(ele);
        System.out.println("Final size: " + ll.getSize());
    }
}
