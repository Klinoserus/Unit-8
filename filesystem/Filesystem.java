import java.util.Scanner;

public class Filesystem {

    public String[] drives = new String[26];
    public Directory CWD;

    public Entry getEntry(String path) {
        String[] parts = path.split("/");
        path = parts[parts.length - 1];

        if (parts[parts.length - 2].name)

            return path;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("exit")) {
            input = scanner.nextLine();
        }
    }
}
