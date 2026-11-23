import java.util.ArrayList;

public class VendingMachine {
    public static void main(String[] args) {
        ArrayList<String> snacks = new ArrayList<String>(); // Step 1
        snacks.add("Goldfish");
        snacks.add("Fritos");
        snacks.add("Skittles");
        snacks.add("Snickers");
        snacks.add("Chex Mix");

        System.out.println("Here's what we have available to buy: " + snacks); // Step 2

        snacks.remove(3); // Step 3

        snacks.add(2, "Doritos"); // Step 4

        System.out.println("Here's the updated list: " + snacks); // Step 5
        System.out.println("We have " + snacks.size() + " snacks left");

        snacks.clear(); // Step 6

        System.out.println("Here's the final list: " + snacks);
    }
}
