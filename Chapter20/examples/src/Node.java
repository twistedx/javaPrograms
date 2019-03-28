class Node<T>
{
  T value;
  Node<T> next;

  Node(T val, Node<T> n)
  {
    value = val;
    next = n;
  }

  Node(T val)
  {
    value = val;
  }
}

