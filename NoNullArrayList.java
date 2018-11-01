import java.util.ArrayList;
import java.util.List;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList () {
    super();
  }
  public NoNullArrayList (int startingCapacity) {
    super(startingCapacity);
  }
  public T set(int index, T element) {
    if (element == null) throw new IllegalArgumentException("You cannot set a null!");
    super.set(index, element);
    return element;
  }
  public boolean add(T t) {
    if (t == null) throw IllegalArgumentException("You cannot add a null!");
    super.add(t);
    return true;
  }
  public void add(int index, T element) {
    if (element == null) throw IllegalArgumentException("You cannot add a null!");
    super.add(index, element);
  }
}
