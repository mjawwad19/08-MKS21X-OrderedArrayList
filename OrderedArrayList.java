public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public T set(int index, T element) {
    if (element != null) remove(index);
    //I didn't modify remove in NoNullArrayList sadly
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
  and figure what index to add to.
  - need to compare the given element to all other elements by looping through
  - compareTo documentation states that if the element paramater is greater than the element
    currently on the loop (via get(i)), it will be positive
  - therefore you have to get to a point where the param is less than the element on the loop
    but greater than the previous to find the index, therefore, index is incremented up*/
  private int Sorted(T element) {
    int i = 0;
    if (element == null) return i;
    while (i < size() && element.compareTo(get(i)) > 0) {
      i++;
    }
    return i;
  }
}
