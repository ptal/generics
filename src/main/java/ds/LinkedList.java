package ds;

public class LinkedList<T> implements List<T> {
  private Node<T> head;
  private Node<T> tail;
  private int size;

  public LinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  public String toString() {
    return null;
  }

  private static class Node<T> {
    private T value;
    private Node<T> next;

    private Node(T x) {
      this(x, null);
    }

    private Node(T x, Node<T> next) {
      value = x;
      this.next = next;
    }
  }
}
