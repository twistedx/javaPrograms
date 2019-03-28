import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Product {

    private String name;
    private double price;
    private int quan;
    private static ArrayList<Product> data = new ArrayList<>();
    private static ArrayList<Product> temp = new ArrayList<>();

    public Product(String name) {
        this.name = name;
        this.price = 1;
        this.quan = 1;
    }

    public Product(String name, double price, int quan) {
        this.name = name;
        this.price = price;
        this.quan = quan;
    }

    public static ArrayList<Product> loadDatabase(String name) {

        File f = new File(name);


        try {
            Scanner inputFile = new Scanner(f);
            inputFile.nextLine();
            while (inputFile.hasNextLine()) {
                String temp = (inputFile.nextLine());
                //split price and quantity
                int t = temp.indexOf('$');
                int dot = temp.indexOf('.');

                //save the name
                String n1 = temp.substring(0, t).trim();
                //save the price
                String n2 = temp.substring(t + 1, dot + 3);
                //save the quan
                String n3 = temp.substring(dot + 3, temp.length()).trim();
//                  Debugging code
//                System.out.println(n1 + " " + n2 + " " + n3);
                data.add(new Product(n1, Double.parseDouble(n2), Integer.parseInt(n3)));

            }
        } catch (FileNotFoundException e) {
            System.out.println(name + " (The system cannot find the file specified)");
        }
        return data;
    }

    public static ArrayList<Product> loadSortedDatabase(String name, String key) {
        if (key.equalsIgnoreCase("name")) {
            loadDatabase(name);
            sort(data, 0, data.size() - 1);
            return data;
        } else if (key.equalsIgnoreCase("price")) {
            loadSortedDatabaseByPrice(name);
            return data;
        } else if (key.equalsIgnoreCase("quantity")) {
            loadSortedDatabaseByQuantity(name);
            return data;
        } else if (key.equalsIgnoreCase("total")) {
            loadSortedDatabaseByTotal(name);
            return data;
        } else if (key.equalsIgnoreCase("both")) {
            sortByName(name);
            loadSortedDatabaseByName(data);

            return data;
        }
        return temp;
    }

    public static void sortByName(String name) {
        loadDatabase(name);
        sort(data, 0, data.size() - 1);
        for (Product temp : data) {
            new Product(temp.getName(), temp.getPrice(), temp.getQuantity());
            //         System.out.print(temp);
        }
    }

    public static ArrayList<Product> loadSortedDatabaseByPrice(String name) {


        loadDatabase(name);
        sortByPrice(data, 0, data.size() - 1);
        return data;
    }

    public static ArrayList<Product> loadSortedDatabaseByQuantity(String name) {

        loadDatabase(name);
        sortByQuantity(data, 0, data.size() - 1);
        return data;
    }

    public static void loadSortedDatabaseByTotal(String name) {

        loadDatabase(name);
        sortByTotal(data, 0, data.size() - 1);
    }

    public static void loadSortedDatabaseByName(ArrayList<Product> temp) {

        sortByNameAndPrice(temp, 0, temp.size() - 1);

    }


    public static void sort(ArrayList<Product> data, int start, int end) {
        if (start < end) {
            int divide = partition(data, start, end);
            sort(data, start, divide - 1);
            sort(data, divide + 1, end);
        }
    }

    public static int partition(ArrayList<Product> data, int start, int end) {
        int pivotIndex = (start + end) / 2;  //integer math is OK
        Product pivotValue = data.get(pivotIndex);

        Product t = data.get(start);  //preserve copy of starting element
        data.set(start, (pivotValue));  //put pivotValue at beginning
        data.set(pivotIndex, t);  //put starting element in the middle

        int endOfSmallElements = start;

        for (int subscript = start + 1; subscript <= end; subscript++) {
            if (data.get(subscript).getName().compareTo(pivotValue.getName()) < 0) {
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


    public static void sortByPrice(ArrayList<Product> data, int start, int end) {
        if (start < end) {
            int divide = partitionByPrice(data, start, end);
            sortByPrice(data, start, divide - 1);
            sortByPrice(data, divide + 1, end);
        }

    }

    public static int partitionByPrice(ArrayList<Product> data, int start, int end) {
        int pivotIndex = (start + end) / 2;  //integer math is OK
        Product pivotValue = data.get(pivotIndex);

        Product t = data.get(start);  //preserve copy of starting element
        data.set(start, (pivotValue));  //put pivotValue at beginning
        data.set(pivotIndex, t);  //put starting element in the middle

        int endOfSmallElements = start;

        for (int subscript = start + 1; subscript <= end; subscript++) {
            if (data.get(subscript).getPrice() < pivotValue.getPrice()) {
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

    public static void sortByQuantity(ArrayList<Product> data, int start, int end) {
        if (start < end) {
            int divide = partitionByQuantity(data, start, end);
            sortByQuantity(data, start, divide - 1);
            sortByQuantity(data, divide + 1, end);
        }

    }

    public static int partitionByQuantity(ArrayList<Product> data, int start, int end) {
        int pivotIndex = (start + end) / 2;  //integer math is OK
        Product pivotValue = data.get(pivotIndex);

        Product t = data.get(start);  //preserve copy of starting element
        data.set(start, (pivotValue));  //put pivotValue at beginning
        data.set(pivotIndex, t);  //put starting element in the middle

        int endOfSmallElements = start;

        for (int subscript = start + 1; subscript <= end; subscript++) {
            if (data.get(subscript).getQuantity() < pivotValue.getQuantity()) {
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

    public static void sortByTotal(ArrayList<Product> data, int start, int end) {
        if (start < end) {
            int divide = partitionByTotal(data, start, end);
            sortByTotal(data, start, divide - 1);
            sortByTotal(data, divide + 1, end);
        }

    }

    public static int partitionByTotal(ArrayList<Product> data, int start, int end) {
        int pivotIndex = (start + end) / 2;  //integer math is OK
        Product pivotValue = data.get(pivotIndex);

        Product t = data.get(start);  //preserve copy of starting element
        data.set(start, (pivotValue));  //put pivotValue at beginning
        data.set(pivotIndex, t);  //put starting element in the middle

        int endOfSmallElements = start;

        for (int subscript = start + 1; subscript <= end; subscript++) {
            if (data.get(subscript).getTotal() < pivotValue.getTotal()) {
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

    public static void sortByNameAndPrice(ArrayList<Product> data, int start, int end) {
        if (start < end) {
            int divide = partitionByNameAndPrice(data, start, end);
            sortByNameAndPrice(data, start, divide - 1);
            sortByNameAndPrice(data, divide + 1, end);

        }
    }

    public static int partitionByNameAndPrice(ArrayList<Product> data, int start, int end) {
        int pivotIndex = (start + end) / 2;  //integer math is OK
        Product pivotValue = data.get(pivotIndex);

        Product t = data.get(start);  //preserve copy of starting element
        data.set(start, (pivotValue));  //put pivotValue at beginning
        data.set(pivotIndex, t);  //put starting element in the middle

        int endOfSmallElements = start;

        for (int subscript = start + 1; subscript <= end; subscript++) {
            if (data.get(subscript).getName().equals(pivotValue.getName()) && data.get(subscript).getPrice() < pivotValue.getPrice()) {

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

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quan;
    }

    public double getTotal() {
        return (price * quan);
    }

    public String toString() {
        if (quan > 1) {
            return String.format("%s costs $%,.2f. There are %d left. The cost to buy them all is $%,.2f.", getName(), getPrice(), getQuantity(), getTotal());
            //Fire TV costs $50.25. There are 23 left. The cost to buy them all is $1,155.75.\n
        } else {
            return String.format("%s costs $%,.2f. There is only %d left! The cost to buy them all is $%,.2f.", getName(), getPrice(), getQuantity(), getTotal());
        }
    }
}



