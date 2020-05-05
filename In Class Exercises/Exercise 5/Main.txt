public class Main {
    public static void main (String[] args) {

        //Create house objects
        House ronanHouse = new House(11.5, 8, 1995, "yellow");
        House brianHouse = new House(15.4, 12, 1977, "blue");
        House billHouse = new House(9.2, 17.3, 2009, "white and blue");

        System.out.println("\nRonan House");
        ronanHouse.printTotalArea();
        ronanHouse.printBuildYearAndColor();

        System.out.println("\n");

        System.out.println("\nBrian House");
        brianHouse.printTotalArea();
        brianHouse.printBuildYearAndColor();

        System.out.println("\n");

        System.out.println("\nBill House");
        billHouse.printTotalArea();
        billHouse.printBuildYearAndColor();

    }
}
