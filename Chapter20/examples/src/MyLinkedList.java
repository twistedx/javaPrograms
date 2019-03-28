public class MyLinkedList<T> implements CustomList<T> {

  private Node<T> root;
  private int numNodes = 0;

  public boolean isEmpty() {
    return size() == 0;
  }

  public int size() {
    return numNodes; //O(1) one time bound step
  }

  public void add(T e) {
    if (root == null) {
      root = new Node<T>(e);
    } else {
      //not making a copy of root
      // cursor points to same thing as root
      Node<T> cursor = root;
      // Keep going until cursor points to the last node. (Stops at last node)
      while (cursor.next != null) {
        cursor = cursor.next;
      }
      // attach a new node
      cursor.next = new Node<T>(e);

    }
    numNodes++;
  }

  public void add(int index, T e) {

    Node<T> cursor = root;

    if (index == 0) {
      Node<T> newNode = new Node<T>(e);
      newNode.next = root;
      root = newNode;

    } else {

      for (int counter = 1; counter <= index - 1; counter++) {

        cursor = cursor.next;
      }
      Node<T> newNode = new Node<T>(e);
      newNode.next = cursor.next;
      cursor.next = newNode;
    }
    numNodes++;
  }

  public T remove(int index) {

    Node<T> cursor = root;
    T removedThing = null;

    if (index == 0) {
      removedThing = root.value;
      root = root.next;
    } else {

      for (int i = 1; i <= index - 1; i++) {
        cursor = cursor.next;
      }
      removedThing = cursor.next.value;
      cursor.next = cursor.next.next;
    }
    numNodes--;
    return removedThing;
  }


  public boolean remove(T e) {
    if (contains(e)) {
      remove(indexOf(e));
      return true;
    } else {
      return false;
    }
  }

  //teachers code
  //if (root.value.equals(e)){
  // root = root.next
  //return true;
  // } else {
  //Node<T> pred = root;
  //Node<T> cursor = root.next;
  // while (cursor != null){
  // if (cursor.value.equals(e){
  // pred.next = cursor.next;
  // return true;
  //}
  //pred = pred.next
  //cursor = cursor.next //move pred and cursor both forward.


  public T get(int index) {
    Node<T> cursor = root;
    // Will loop index times
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }

  public int indexOf(T element) {
    Node<T> cursor = root;
    int counter = 0;

    // Keep going until cursor points to the last node. (Stops at last node)
    while (cursor != null) {
      if (cursor.value.equals(element)) {
        return counter;
      } else {
        counter++;
        cursor = cursor.next;
      }
    }
    return -1;
  }

  public boolean contains(T element) {
    Node<T> cursor = root;

    while (cursor != null) {
      if (cursor.value.toString().contains(element.toString())) {
        return true;
      } else {
        cursor = cursor.next;
      }
    }
    return false;
  }

  public void set(int index, T e) {

    Node<T> cursor = root;
    int counter = 0;

    if (index == 0) {
      cursor.value = e;
    }

    while (cursor != null) {
      counter++;
      cursor = cursor.next;

      if (counter == index) {
        cursor.value = e;
      }
    }

  }
}
