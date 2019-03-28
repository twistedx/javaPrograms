public class MenuItem {

    private String name;
    private double price;
    String temp1;

    public MenuItem(String name, double price){

        this.name = name;
        this.price = price;


    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    public String toString() {
        StringBuilder a = new StringBuilder();
        a.append(name);
        a.append(" ");
        a.append('$');
        if (price < 1.00) {
            temp1 = Double.toString(price);
            temp1 = temp1.substring(1);
            a.append(temp1);
            if (temp1.length() < 3){
                a.append('0');
            }

            return a.toString();
        } else  {
            a.insert(a.length(), price);
            a.append('0');
            return a.toString();
        }
    }
}
