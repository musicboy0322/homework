package homework;

public class Checklist {

    public static void main(String[] args) {

        Customer[] customers = {
                new Customer("0013", 490, 0),
                new Customer("0052", 1000, 100),
                new Customer("0008", 290, 0),
                new Customer("2122", 2000, 200)
        };
        for (int i = 0; i < customers.length; i++) {
            customers[i].print();
        }



    }


}
