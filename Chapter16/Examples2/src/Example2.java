public class Example2 {

  public static int sum(int[] list, int subscript) {
    if (subscript < list.length) {
      return list[subscript] + sum(list, subscript + 1);
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    int[] list = {50, 60, 70, 80, 90, 100, 25, 20, 10};
    int subscript = 0;

    System.out.println(sum(list,subscript));

  }

}
