public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public T set(int index, T element) {
    remove(index);
    add(element);
    return element;
  }

  public boolean add(T element) {
    super.add(Sorted(element), element);
    return true;
  }

  public void add(int index, T element) {
    add(element);
  }

  /*SanityCheck for helper fxn to sort the array list
  and figure what index to add to.*/
  private int Sorted(T element) {
    int i = 0;
    while (i < size() && element.compareTo(get(i)) > 0) {
      i++;
    }
    return i;
  }
}
