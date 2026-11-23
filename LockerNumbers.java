import java.util.HashMap;

public class LockerNumbers {
    public static void main(String[] args) {

        HashMap<Integer, String> locker = new HashMap<Integer, String>(); // Step 1

        locker.put(11, "George"); // Step 2
        locker.put(5, "Anna");
        locker.put(43, "Harper");

        locker.remove(11); // Step 3

        System.out.println(locker.size()); // Step 4

        locker.put(17, "Mark"); // Step 5

        System.out.println(locker.get(11)); // Step 6

        for (int num : locker.keySet()) { // Bonus Challenge
            if ((locker.get(num)).equalsIgnoreCase("Anna")) {
                System.out.println("Your locker is number " + num);
            }
        }

        locker.clear(); // Step 7

    }
}
