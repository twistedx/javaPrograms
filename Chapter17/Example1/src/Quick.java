import java.util.ArrayList;

public class Quick {
  public static void sort(ArrayList<Integer> data, int start, int end) {
    if (start < end) {
      int divide = partition(data, start, end);
      sort(data, start, divide - 1);
      sort(data, divide + 1, end);
    }
  }

  public static int partition(ArrayList<Integer> data, int start, int end) {
    int pivotIndex = (start + end) / 2;  //integer math is OK
    int pivotValue = data.get(pivotIndex);

    int t = data.get(start);  //preserve copy of starting element
    data.set(start, pivotValue);  //put pivotValue at beginning
    data.set(pivotIndex, t);  //put starting element in the middle

    int endOfSmallElements = start;

    for (int subscript = start + 1; subscript <= end; subscript++) {
      if (data.get(subscript) <= pivotValue) {
        endOfSmallElements++;

        t = data.get(subscript);
        data.set(subscript, data.get(endOfSmallElements));
        data.set(endOfSmallElements, t);

      }
    }
    t = data.get(endOfSmallElements);
    data.set(endOfSmallElements, pivotValue);
    data.set(start, t);

    return endOfSmallElements;
  }
}