package ds;

public class LinkedList<T> implements List<T> {
    private Node head;
    private Node tail;
    private int size;
    
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public String toString() {
        return "";
    }
    
    private class Node {
        private int value;
        private Node next;
        
        private Node(int x) {
            this(x, null);
        }
        
        private Node(int x, Node next) {
            value = x;
            this.next = next;
        }
    }
}
