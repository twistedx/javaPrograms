public interface CustomList<T> {
  //returns true if the list is empty
  public boolean isEmpty();
  //returns the number of elements in the list
  public int size();
  //add an element to the end of the list
  public void add(T e);
  //add an element at the specified location (insert)
  public void add(int index, T e);
  //removes the element at the specified index
  public T remove(int index);
  //removes the first instance of the given element
  public boolean remove(T e);
  //retrieve an element
  public T get(int index);
}

