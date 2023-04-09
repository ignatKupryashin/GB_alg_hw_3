public class MyLinkedList {
    private Node tail;
    private Node head;

    public MyLinkedList() {
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void addFirst(int value){
        Node node = new Node(value);
        node.setNext(this.getHead());
        this.setHead(node);
        if (node.getNext() != null){
            node.getNext().setPrevious(node);
        }
        if (this.getTail() == null){
            this.setTail(node);
        }
    }

    public void addLast(int value){
        Node node = new Node(value);
        node.setPrevious(this.getTail());
        this.setTail(node);
        if (node.getPrevious() != null){
        node.getPrevious().setNext(node);
        }
        if (this.getHead() == null){
            this.setHead(node);
        }
    }

    public void reverse(){
        Node currentNode = head;
        while (currentNode != null){
            Node temp = currentNode.getPrevious();;
            currentNode.setPrevious(currentNode.getNext());
            currentNode.setNext(temp);
            if (currentNode.getNext() == null) {
                this.setTail(currentNode);
            }
            if (currentNode.getPrevious() == null) {
                this.setHead(currentNode);
            }
            currentNode = currentNode.getPrevious();
        }
    }


    public void printList(){
        Node currentNode = this.getHead();
        while (currentNode != null){
            System.out.print(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
    }
}
