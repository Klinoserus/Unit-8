import java.util.HashSet;

public class Astronomy {
    public static void main(String[] args) {

        HashSet<String> constellations = new HashSet<String>(); // Step 1

        constellations.add("Leo Minor"); // Step 2
        constellations.add("Lynx");
        constellations.add("Cepheus");
        constellations.add("Ursa Minor");

        constellations.remove("Cepheus"); // Step 3
        constellations.add("Lacerta");
        constellations.add("Camelopardalis");

        constellations.add("Lynx"); // Step 4

        System.out.println(constellations.size()); // Step 5

        System.out.println(constellations.contains("Cassiopeia")); // Step 6

        constellations.add("Cassiopeia"); // Step 7
        System.out.println(constellations);
    }
}
