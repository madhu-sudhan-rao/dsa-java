class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int value) {
        if (tail == null) {
            this.insertFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size += 1;
    }

    public void insert(int value, int index) {
        if(index == 0) {
            this.insertFirst(value);
            return;
        }

        if(index == size) {
            this.insertLast(value);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(value, temp.next);
        temp.next = newNode;
        size += 1;

    }

    public void removeFirst() {
        head = head.next;
        if (head == null) {
            tail = null;
            return;
        }
        size--;
    }

    public void removeLast() {

        if(size <= 1) {
            this.removeFirst();
            return;
        }
        
        if(head == tail) {
            head = null;
            tail = null;
            return;
        }

        Node temp = this.get(size - 1);
        tail = temp;
        tail.next = null;
        size--;
    }

    public void remove(int index) {
        if(index == 0) {
            this.removeFirst();
            return;
        }

        if(index == size - 1) {
            this.removeLast();
            return;
        }

        Node prevNode = this.get(index - 1);
        prevNode.next = prevNode.next.next;
        size--;


    }

    public Node find(int value) {
        Node node = head;

        while(node != null) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next ) {
            this.value = value;
            this.next = next;
        }
    }
}
