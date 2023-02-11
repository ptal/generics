package ds;

public class DynamicArray<T> implements List<T> {
  private static int INITIAL_CAPACITY = 5;
  private T[] data;
  private int size;

  @SuppressWarnings("unchecked")
  public DynamicArray() {
    data = (T[]) new Object[INITIAL_CAPACITY];
    size = 0;
  }

  public String toString() {
    return null;
  }
}
